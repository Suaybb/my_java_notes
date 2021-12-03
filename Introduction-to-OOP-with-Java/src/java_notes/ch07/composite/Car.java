package java_notes.ch07.composite;

public class Car {
	
	String make;
	String model;
	String year;
	int speed;
	int distance;
	
	// Owner of the car
	Person owner;
	
	public void go(int newDistance) {
		distance += newDistance;
	}
	
	public void accelerate (int newSpeed) {
		speed = newSpeed;
	}
	
	public void stop() {
		speed = 0;
	}
	
	public String getInfo() {
		String info = "Car Info: " + year + " " + make + " " + model + " " + ". Distance: " + distance + " km";
		
		if(owner != null) 
			info += " and its owner is " + owner.firstName + " " + owner.lastName;
		else
			info += " and does not have an owner!";
		return info;
	}
	
}
