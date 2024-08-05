package com.aurionpro.dip.violation.test;

import com.aurionpro.dip.violation.model.TaxCalculator;

public class taxTest {
	public static void main(String[] args) {
		TaxCalculator taxCalc = new TaxCalculator();
		taxCalc.calculateTax(1222, 12);
		
		TaxCalculator taxCalc1 = new TaxCalculator();
		taxCalc1.calculateTax(122, 0);
		
	}

}
