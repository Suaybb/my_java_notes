package java_notes.ch07.overloading;

public class CalculatorOverloaded {

	int add(byte first, byte second) {
		System.out.println("Arguments are in short");
		return first + second;
	}
	
	int add(short first, short second) {
		System.out.println("Arguments are in short");
		return first + second;
	}
	
	int add(int first, int second) {
		System.out.println("Arguments are in int");
		return first + second;
	}
	
	long add(long first, long second) {
		System.out.println("Arguments are in long");
		return first + second;
	}
	
	
	float add (float first, float second) {
		System.out.println("Arguments are in float");
		return first + second;
	}
	
	
}
