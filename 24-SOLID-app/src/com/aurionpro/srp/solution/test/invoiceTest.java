package com.aurionpro.srp.solution.test;

import com.aurionpro.srp.solution.model.inVoice;
import com.aurionpro.srp.solution.model.taxCalculator;
import com.aurionpro.srp.solution.model.taxPrinter;

public class invoiceTest {
	public static void main(String[] args) {
		inVoice invoice = new inVoice("1", "Tax Calculator", 1000, 10);
		taxCalculator taxcalc = new taxCalculator(invoice);
		taxPrinter taxprinter = new taxPrinter(invoice, taxcalc);
		taxprinter.invoice();
	}

}
