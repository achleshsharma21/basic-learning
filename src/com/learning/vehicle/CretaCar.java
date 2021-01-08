package com.learning.vehicle;

public class CretaCar implements Car {

	@Override
	public String getName() {
		return "Creta";
	}

	@Override
	public int getEngineCapacity() {
		return 1499;
	}

	@Override
	public int getSeats() {
		return 5;
	}

	@Override
	public String getModel() {
		return "Crdi Sx";
	}

	@Override
	public String getMake() {
		return "Hyundai";
	}

}
