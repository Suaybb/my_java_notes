package java_notes.ch03;

import java_notes.ch02.car.Car;

public class FinalVariables {
	public static void main(String[] args) {
		
		final int i = 8;
		System.out.println(i);
		
		// Illegal
		// i = 7;
		// i++;
		
		// Following is not illegal
		final long l; // Blank final
		// System.out.println(l);
		l = 7;
		
		// l = 8; // Illegal
		System.out.println(l);

		// Following is ok
		int x = 3;
		int y = 8;
		final int j;
		
		if(x > y)
			j = 9;
		else
			j = 11;
		
		System.out.println(j);
		
		 final Car c1 = new Car();
		 // c1 = new Car();
		 
		 final Car c2;// Blank Final
		 c2 = new Car();
	
	}
}
