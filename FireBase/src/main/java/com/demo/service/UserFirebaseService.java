package com.demo.service;

import com.demo.entity.User;
import com.demo.exception.UserNotFoundException;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class UserFirebaseService {


    public String createUser(User user) throws InterruptedException, ExecutionException {

        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> apiCollection = dbFirestore.collection("users")
                .document(user.getName().toLowerCase())
                .set(user);

        return apiCollection.get().getUpdateTime().toString();
    }

    public User findUserByName(String name) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = dbFirestore.collection("users").document(name.toLowerCase());
        ApiFuture<DocumentSnapshot> documentSnapshotApiFuture = documentReference.get();
        DocumentSnapshot document = documentSnapshotApiFuture.get();

        User user = null;
        if (document.exists()) {
            user = document.toObject(User.class);
            return user;
        }
        throw new UserNotFoundException(name + "  Data is not available !!!");
    }


    public String updateUser(User user) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> apiCollection = dbFirestore.collection("users")
                .document(user.getName().toLowerCase())
                .set(user);
        return apiCollection.get().getUpdateTime().toString();
    }

    public String deleteUser(String name) {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> users = dbFirestore.collection("users").document(name).delete();
        return name + " deleted successfully !!";
    }

    public List<User> getUsers() throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        Iterable<DocumentReference> users = dbFirestore.collection("users").listDocuments();

        List<User> userList = new ArrayList<>();
        for (DocumentReference userRef : users) {
            ApiFuture<DocumentSnapshot> future = userRef.get();
            DocumentSnapshot document = future.get();

            User user = document.toObject(User.class);
            userList.add(user);
        }

        return userList;

    }
}
