package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreaCalculatorTest {
	
	AreaCalculator calculator ;
	
	@BeforeEach
	void init() {
	calculator = new AreaCalculator() ;
	}


	@Test
	void testAreaOfCircle() {
		assertEquals(78.5, calculator.areaOfCircle(5));
	}

}
