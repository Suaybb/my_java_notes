package java_notes.ch02.car;

/** 
 * This is a simple class example.
 * So, create a class and object from that
 * Then use instance variables and methods
 */

public class Car {
	
	public String make;
	public String model;
	public String year;
	public int speed;
	public int distance;
	
	public double go(int newDistance) {
		distance += newDistance;
		double period = (double)newDistance / speed;
		return period;
	}
	
	public void accelerate(int newSpeed) {
		speed = newSpeed;
	}
	
	public void stop() {
		speed = 0;
	}
	
	public String getInfo() {
		String info = "Car info:" + year + " " + make + " " + model + ". Distance: " + distance + " km and travelling at " +  speed + " kmph.";
		return info;
	}
	 
}
