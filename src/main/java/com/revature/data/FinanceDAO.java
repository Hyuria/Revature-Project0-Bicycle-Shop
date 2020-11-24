package com.revature.data;

import com.revature.beans.Finance;
import com.revature.beans.Payment;

public interface FinanceDAO extends GenericDAO<Finance>{
	public Finance add(Finance finance);
}
