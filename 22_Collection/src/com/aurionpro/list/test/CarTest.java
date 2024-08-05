package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.aurionpro.list.model.Car;

public class CarTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Car> cars = new ArrayList<Car>();
		inputClass(scanner, cars);

		for (int i = 0; i < 3; i++) {
			System.out.println(cars.get(i));
		}

		System.out.println("Car with Maximum Milage :");
		int maxMilage = maximumMilage(cars);
		System.out.println(cars.get(maxMilage));

	}

	private static void inputClass(Scanner scanner, List<Car> cars) {
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter ID :");
			int carId = scanner.nextInt();
			System.out.println("Enter Company Name :");
			String companyName = scanner.next();
			System.out.println("Enter Price :");
			int carPrice = scanner.nextInt();
			System.out.println("Enter Milage :");
			double carMilage = scanner.nextDouble();

			cars.add(new Car(carId, companyName, carPrice, carMilage));
		}

	}

	private static int maximumMilage(List<Car> cars) {
		// TODO Auto-generated method stub
		int maxIndex = 0;
		double maxMilage = cars.get(0).milage;
		for (int i = 0; i < cars.size(); i++) {
			if (cars.get(i).milage > maxMilage) {
				maxMilage = cars.get(i).milage;
				maxIndex = i;
			}
		}
		return maxIndex;
	}

}