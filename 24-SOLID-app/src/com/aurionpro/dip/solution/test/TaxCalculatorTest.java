package com.aurionpro.dip.solution.test;

import com.aurionpro.dip.solution.model.DBlogger;
import com.aurionpro.dip.solution.model.Filelogger;
import com.aurionpro.dip.solution.model.TaxCalulator;
import com.aurionpro.dip.violation.model.TaxCalculator;
import com.aurionpro.srp.solution.model.taxCalculator;

public class TaxCalculatorTest {
public static void main(String[] args) {
	TaxCalulator t1 = new TaxCalulator(new DBlogger());
	t1.calculateTax(122, 0);
	
	
	TaxCalulator t2 = new TaxCalulator(new Filelogger());
	t2.calculateTax(122, 0);
	
	
}
}
