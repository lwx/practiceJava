package javaTraining001;


class Cars{
	String brand;
	String model;
	int milage;
	
	void start() {
		System.out.println(brand + " " + model + " has started.");
	}
	void move() {
		System.out.println(brand + " " + model + " has moved.");
	}
	void accelerateFast() {
		System.out.println(brand + " " + model + " has accelerated to " + milage);
	}
	void stop() {
		System.out.println(brand + " " + model + " has stopped.");
	}
}

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars car01 = new Cars();
		
		car01.brand = "Toyota";
		car01.model = "Wish";
		car01.milage = 100;
		
		car01.start();
		car01.move();
		car01.accelerateFast();
		car01.stop();
		

	}

}
