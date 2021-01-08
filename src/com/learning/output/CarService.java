package com.learning.output;

import com.learning.vehicle.Car;

public class CarService {

	public void printSpecifications(Car car) {
		System.out.println("************************************");
		System.out.println("Car Name: " + car.getName());
		System.out.println("Car Engine Capacity: " + car.getEngineCapacity());
		System.out.println("Car Seats: " + car.getSeats());
		System.out.println("Car Model: " + car.getModel());
		System.out.println("Car Make: " + car.getMake());
		System.out.println("************************************");
	}

}
