package com.learning.output;

import com.learning.vehicle.*;

public class Out {
	
	
	public static void main(String[] args) {
		
		Car firstCar = new SwiftCar();
		Car secondCar = new BrezzaCar();
		
		Car thirdCar = new CretaCar();
		Car forthCar = new CretaCar();
		
		//System.out.println(thirdCar.equals(forthCar));
		
		 // comparing objects and 'equals' and 'hashcode' method. 
		
		
		CarService carService = new CarService();
		carService.printSpecifications(firstCar);
		carService.printSpecifications(secondCar);
		carService.printSpecifications(thirdCar);
		
	}
}
