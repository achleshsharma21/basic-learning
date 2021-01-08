package com.learning.vehicle;

public class SwiftCar implements MarutiCar {

	@Override
	public String getName() {
		return "Swift Dezire";
	}

	@Override
	public int getEngineCapacity() {
		return 1200;
	}

	@Override
	public int getSeats() {
		return 5;
	}

	@Override
	public String getModel() {
		return "Vdi";
	}
}
