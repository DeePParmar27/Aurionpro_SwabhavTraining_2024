package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationTest {

    Operation operation ;
	
	@BeforeEach
    void  init() {
	 operation = new Operation();
	}
	
	@AfterEach
	void status() {
		System.out.println("Test Finish");
	}
	
	@Test
	public void testAddition() {
		assertEquals(30, operation.addition(10, 20));
	}

	@Test
	public void testSubtraction() {
		assertEquals(12, operation.subtraction(18, 6));
	}
	
	@Test
	void testSquare(){
		int[] square = {25 , 4 , 9 };
		int[] number = {5 , 2 , 3 } ;
		assertArrayEquals(square , operation.squareOfArray(number));
	}
	
	
	@Test
	void TestisEven() {
		assertEquals(true, operation.isEven(12));
	}
	

	@Test
	void TestDivision() {
		// assertEquals(12, operation.division(144, 12));
		assertThrows(ArithmeticException.class, ()->operation.division(12, 0));
	}
	
	
}
