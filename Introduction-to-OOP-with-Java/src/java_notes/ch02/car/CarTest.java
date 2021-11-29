package java_notes.ch02.car;

public class CarTest {

	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		System.out.println("When the car stands still.");
		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2020";
		car1.distance = 0;
		car1.speed = 0;
		String info = car1.getInfo();
		System.out.println(info);
		
		System.out.println("\nWhen the car moves.");
		car1.accelerate(140);
		car1.go(100);
		double timeToGo = car1.go(1000);
		System.out.println("Time to go 1000km " + timeToGo + " hour.");
		System.out.println(car1.getInfo());
		car1.stop();
		System.out.println(car1.getInfo());
	} 
	
}
