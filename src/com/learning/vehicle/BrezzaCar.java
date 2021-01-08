package com.learning.vehicle;

public class BrezzaCar implements MarutiCar {

	@Override
	public String getName() {
		return "Brezza";
	}

	@Override
	public int getEngineCapacity() {
		return 1499;
	}

	@Override
	public int getSeats() {
		return 4;
	}

	@Override
	public String getModel() {
		return "Vdi Dual Tone";
	}
}
