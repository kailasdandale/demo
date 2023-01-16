package com.neo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.model.Pancard;
import com.neo.model.Person;
import com.neo.repositories.PanRepo;
import com.neo.repositories.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private PanRepo panRepo;

	
	public Person save(Person person) {
		return personRepo.save(person);
	}


	public Person uodateData(Person p, int id) {
		
		Person person = personRepo.findById(id).get();
		
		if(p.getName()!=null){
			person.setName(p.getName());
		}
		if(p.getPancard()!=null) {
			
			Pancard pan=new Pancard();
			pan.setPanId(person.getPancard().getPanId());
			pan.setPanName(p.getPancard().getPanName());
		 	
			
			person.setPancard(pan);
			
		}
		
		return personRepo.save(person);
	}

}
