package com.revature.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;

import com.revature.beans.Offer;
import com.revature.utils.ConnectionUtil;

public class OfferPostgres implements OfferDAO{
	private ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

	@Override
	public Offer add(Offer t) {
		Offer retValOffer = null;
		
		try (Connection conn = cu.getConnection()){
			conn.setAutoCommit(false);
			//String sqlString = "insert into "
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return retValOffer;
	}

	@Override
	public Offer getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Offer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Offer t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Offer t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Offer getOfferByBicycle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Offer getOfferByPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Offer> getAllOngoingOffer() {
		// TODO Auto-generated method stub
		return null;
	}

}
