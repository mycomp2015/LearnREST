package com.digient.gitesh.resource;

import com.digient.gitesh.dto.MyResponse;
import com.digient.gitesh.dto.Person;

public interface PersonService {
	
	public MyResponse addPerson(Person p);
	
	public MyResponse deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();



	

}
