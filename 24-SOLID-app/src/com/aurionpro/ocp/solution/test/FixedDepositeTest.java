package com.aurionpro.ocp.solution.test;

import com.aurionpro.ocp.solution.model.DiwaliIntrest;
import com.aurionpro.ocp.solution.model.FixedDeposite;
import com.aurionpro.ocp.solution.model.IFestivalType;

public class FixedDepositeTest {
	public static void main(String[] args) {
		FixedDeposite fd =  new FixedDeposite(1222, "Deep", 1200, 10,new DiwaliIntrest());
		System.out.println(""+fd.simpleIntrest());
		
		
	}

}
