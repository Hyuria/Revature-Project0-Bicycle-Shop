package com.revature.services;

import java.util.Set;

import com.revature.beans.Bicycle;
import com.revature.beans.Offer;
import com.revature.beans.Person;
import com.revature.data.OfferPostgres;

public class OfferService {
	private OfferPostgres offerPostgres;
	
	public OfferService() {
		offerPostgres = new OfferPostgres();
	}
	
	public Integer addOffer(Offer t) {
		return offerPostgres.add(t).getId();
	}
	
	public Offer getByInt(Integer id) {
		return offerPostgres.getById(id);
	}
	
	public Set<Offer> getAll(){
		return offerPostgres.getAll();
	}
	
	public void update(Offer t) {
		offerPostgres.update(t);
	}
	
	public void delete(Offer t) {
		offerPostgres.delete(t);
	}
	
	public Set<Offer> getOfferByBicycle(Bicycle b){
		return offerPostgres.getOfferByBicycle(b);
	}
	
	public Set<Offer> getOfferByPerson(Person p){
		return offerPostgres.getOfferByPerson(p);
	}
}
