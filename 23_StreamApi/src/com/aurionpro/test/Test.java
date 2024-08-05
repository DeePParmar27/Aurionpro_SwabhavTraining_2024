package com.aurionpro.test;

import java.time.format.ResolverStyle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		
		//--Operation Performed on stream does'nt modefy the source
		List<Integer> numbers = Arrays.asList(100,2,90,46,55,85,79);
		Stream<Integer> numberStream = numbers.stream();
		
		// numberStream.forEach((n)->System.out.print(n+" "));
		
//		List<Integer> FilteredNumbers = numbers.stream().filter((n)->(n%2 != 0))
//		             .filter((n)-> (n>35))
//		             .collect(Collectors.toList());
		
		
		List<Integer> squareNumbers = numbers.stream().map((number)->number*number).collect(Collectors.toList());
		System.out.println(squareNumbers);
		
		
		int sum = numbers.stream().reduce(0,(number1 , number2)->number1+number2);
		System.out.println(sum);
		            
		numbers.stream().sorted().forEach((number)->System.out.println(number));
		
		numbers.stream().sorted(Comparator.reverseOrder()).forEach((number)->System.out.println(number));
		
//		Optional<Integer> max = numbers.stream().max((number1 , number2)->number1-number2);
//		if(max.isPresent())
//			System.out.println("MAX :- "max.get());
//		
		
		Optional<Integer> minimum = numbers.stream().min((number1 , number2)->number1-number2);
		
		if(minimum.isPresent())
			System.out.println("MIN :" +minimum.get());
	
		
	}
	
}
