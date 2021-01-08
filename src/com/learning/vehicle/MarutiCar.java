package com.learning.vehicle;

public interface MarutiCar extends Car {
	
	public default String getMake() {
		return "Maruti Suzuki";
	}

}
