package com.aurionpro.ocp.violation.test;

import com.aurionpro.ocp.violation.model.FixedDeposite;
import com.aurionpro.ocp.violation.model.FixedDeposite.festivalType;

public class FixedDepositeTest {
	public static void main(String[] args) {
		FixedDeposite fixeddeposite = new FixedDeposite(1221, "Deep", 10000, 12, festivalType.DIWALI);
		System.out.println(fixeddeposite.simpleIntrest());
	}

}
