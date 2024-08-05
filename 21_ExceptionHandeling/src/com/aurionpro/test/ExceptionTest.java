package com.aurionpro.test;

public class ExceptionTest {
	public static void main(String[] args) {
		
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			
			double result = number1 / number2 ;
			System.out.println("Division is "+result);
		}  //This all are Unchecked Exception
		catch(ArithmeticException exception) {
			System.out.println("Number2 cannot be Zero");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Please Enter Two values.");
		}
		catch(NumberFormatException exception){
			System.out.println("Division cannot br performed other than integre Value.Please enter a integer values");
		}
		catch(Exception exception) {
			System.out.println("Exception Occured");
		}
		finally
		{
			System.out.println("This is inside final Block");
		}
		System.out.println("Existing");

		
	}

}
