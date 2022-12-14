package com.erudio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.erudio.model.Person;

@Service
public class PersonService {
	
	//simular um id no banco de dados
	private final AtomicLong counter = new AtomicLong();
	
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
		
	}
	
	public Person findById(String id) {
		Person person = new Person();
		//incrementAndGet() = pegar um número gerar ele e imcrementá-lo
		person.setId(counter.incrementAndGet());
		person.setFirstName("Danielle");
		person.setLastName("Albuquerque");
		person.setAddress("Recife - PE");
		person.setGender("Female");
		return person;	
	}
	
	public List<Person> findAll(){
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name" + i);
		person.setLastName("Last name" + i);
		person.setAddress("Some address in Brasil" + i);
		person.setGender("Female");
		return person;	
	}

}
