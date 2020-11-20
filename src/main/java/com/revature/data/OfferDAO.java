package com.revature.data;

import java.util.Set;

import com.revature.beans.Bicycle;
import com.revature.beans.Offer;
import com.revature.beans.Person;

public interface OfferDAO extends GenericDAO<Offer>{
	public Offer add(Offer offer);
	public Offer getOfferByBicycle();
	public Offer getOfferByPerson();
	public Set<Offer> getAllOngoingOffer();
}
