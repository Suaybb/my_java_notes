package java_notes.ch08.statik;

public class StaticDemo {

	static int i = 10;
	int j = 10;
	
	
	public static void main(String[] args) {
		
		System.out.println("Static demo.i: " + i);
		// or
		System.out.println("Static demo.i: " + StaticDemo.i);
		
		StaticDemo.increment();
		
		System.out.println("Static demo.i: " + StaticDemo.i);
		
		StaticDemo st1 = new StaticDemo();
		StaticDemo st2 = new StaticDemo();
		
		// Unethical access
		System.out.println("st1.i: " + st1.i);
		System.out.println("st2.i: " + st2.i);
		
		StaticDemo.increment();
		
		// Unethical access
		st1.increment();
		st2.increment();
		
		System.out.println("st1.i: " + st1.i);
		System.out.println("st2.i: " + st2.i);
		System.out.println("StaticDemo.i: " + StaticDemo.i);

		setI(22);
		aMethod();
	}
	
	static void increment() {
		i++;
	}
	
	
	static void setI(int i) {

		StaticDemo.i = i;

	}
	
	static void aMethod() {
		
		int i = 7;
		System.out.println("Local i: " + i);
		System.out.println("StaticDemo's i: " + StaticDemo.i);
		
	}
	
	
}
