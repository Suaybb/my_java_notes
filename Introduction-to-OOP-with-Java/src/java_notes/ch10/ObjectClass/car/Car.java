package java_notes.ch10.ObjectClass.car;

public class Car {

	public String make;
	public String model;
	public String year;
	public int speed;
	public int distance;
	
	public Car(String make, String model, String year, int speed, int distance) {
		
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.distance = distance;
		
	}
	
	
	public String getInfo() {
		String info = "Car info:" + year + " " + make + " " + model + ". Distance: " + distance + " km and travelling at " +  speed + " kmph.";
		return info;
	}

//	@Override
//	public String toString() {
//		
//		String classInfoString = new String();
//		
//		classInfoString += "\nCar Info\n";
//		classInfoString += "Make: " + make;
//		classInfoString += " Model: " + model;
//		classInfoString += " Year: " + year;
//		classInfoString += " Distance: " + distance;
//		classInfoString += " Speed: " + speed;
//		
//		return classInfoString;
//		
//	}
//	
	
}
