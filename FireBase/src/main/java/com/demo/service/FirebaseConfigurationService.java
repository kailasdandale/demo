package com.demo.service;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;



@Service
public class FirebaseConfigurationService {

	@PostConstruct
	public void initilizer() {

		FileInputStream serviceAccount = null;
		try {
			
			serviceAccount =new FileInputStream("./ServiceAccount.json");
			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://myfirebase-7af4e.firebaseio.com")
					.build();
			FirebaseApp.initializeApp(options);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
