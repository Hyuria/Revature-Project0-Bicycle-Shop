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
			String sqlString = "insert into offer values (default, ?, ?, ?)";
			String[] keys = {"id"};
			PreparedStatement pstmt = conn.prepareStatement(sqlString, keys);
			pstmt.setInt(1, t.getBicycle().getId());
			pstmt.setInt(2, t.getPerson().getId());
			pstmt.setDouble(3, t.getPrice());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				retValOffer = t;
				retValOffer.setId(rs.getInt(1));
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return retValOffer;
	}

	@Override
	public Offer getById(Integer id) {
		Offer offer = null;
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
	
	public void resetDefault() {
		try (Connection conn = cu.getConnection()){
			String sqlString = "select setval('bicycleshop.offer_id_seq', max(id)) FROM offer";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlString);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
