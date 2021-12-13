package java_notes.ch10.ObjectClass;

import java_notes.ch10.ObjectClass.car.Car;

public class ToStringExample extends Object{

	
	public static void main(String[] args) {
		
		Car c1 = new Car("Mercedes", "Maybach", "2018", 250, 3000);
		
		//System.out.println("c1:" + c1); // 1- Same thing with c1.toString()
		System.out.println("c1.toString(): " + c1.toString()); // 1-same thing with c1
		//System.out.println(c1.getInfo());
		System.out.format("%-1s: %1s\n", "c1", c1);
		
		System.out.format("%-1s: %1s\n", "c1.hashcode()", c1.hashCode()); // Return int value from hashcode
		
		System.out.println("c1.getClass().getName(): " + c1.getClass().getName());
		
		System.out.println("c1.getClass().getName()@Integer.toHexString(c1.hashCode()): " + c1.getClass().getName() + "@"+ Integer.toHexString(c1.hashCode()));
		
		
	}
	
	
}
