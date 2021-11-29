package java_notes.ch03.references.nullPointer;

import java_notes.ch02.car.Car;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println("When the car stands still.");
		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2020";
		car1.distance = 0;
		car1.speed = 0;
		String infoMercedes = car1.getInfo();
		System.out.println(infoMercedes);
		
		System.out.println("\nWhen the car moves.");
		car1.accelerate(140);
		car1.go(100);
		double timeToGoMercedes = car1.go(1000);
		System.out.println("Time to go 1000km " + timeToGoMercedes + " hour.");
		System.out.println(car1.getInfo());
		car1.stop();
		System.out.println(car1.getInfo());
		
		System.out.println("***********************************");
		
		car2.make = "Bmw";
		car2.model = "5.20";
		car2.year = "2021";
		car2.distance = 0;
		car2.speed = 0;
		String infoBmw = car2.getInfo();
		System.out.println(infoBmw);
			
		car2.accelerate(140);
		car2.go(100);
		double timeToGoBmw = car2.go(1000);
		System.out.println("Time to go 1000km " + timeToGoBmw + " hour.");
		System.out.println(car1.getInfo());
		car2.stop();
		System.out.println(car1.getInfo());

		System.out.println("***********************************");
		
		car2 = null;
		
		// car2.getInfo(); Get the NullPointerException 
		
		if (car2 != null)
			System.out.println(car2.getInfo());
		else 
			System.out.println("Null reference");
		
	} 
	
}
