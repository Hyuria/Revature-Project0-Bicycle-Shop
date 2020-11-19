package com.revature.data;

import java.util.Set;

import com.revature.beans.Bicycle;
import com.revature.beans.Person;
import com.revature.exceptions.NonUniqueUsernameException;

public interface CustomerDAO extends GenericDAO<Person>{
	
	public Person add(Person p) throws NonUniqueUsernameException;
	public Person getByUsername(String username);
	public Set<Bicycle> showOwnedBicycles(Person p);
}
