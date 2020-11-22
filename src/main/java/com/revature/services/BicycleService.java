package com.revature.services;

import java.util.Set;

import com.revature.beans.Bicycle;
import com.revature.beans.Person;
import com.revature.beans.Status;
import com.revature.data.BicyclePostgres;
import com.revature.data.PersonPostgres;

public class BicycleService {
	private BicyclePostgres bicyclePostgres;
	private PersonPostgres personPostgres;
	
	public BicycleService() {
		bicyclePostgres = new BicyclePostgres();
		personPostgres = new PersonPostgres();
	}
	
	public Bicycle getBicycleById(Integer id) {
		return bicyclePostgres.getById(id);
	}
	
	public Set<Bicycle> getAll(){
		return bicyclePostgres.getAll();
	}
	
	public void update(Bicycle b) {
		bicyclePostgres.update(b);
	}
	
	public void delete(Bicycle b) {
		bicyclePostgres.delete(b);
	}
	
	public Integer addBicycle(Bicycle b) {
		return bicyclePostgres.add(b).getId();
	}
	
	public Set<Bicycle> getAvaliableBicycles(){
		return bicyclePostgres.getAvailableBicycles();
	}
	
	public void registerOwner(Bicycle b, Person p) {
		Status status = new Status();
		status.changeToUnavaliable();
		b.setStatus(status);
		bicyclePostgres.update(b);
		bicyclePostgres.updateOwner(b, p);
	}
	
	
	

}
