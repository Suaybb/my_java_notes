package java_notes.ch07.varArg;

public class VarArgMethod {

	// Main as var args method
	public static void main(String ... strings) {
		
		calculateAverage(4, 3);
		calculateAverage(4, 3, 8);
		
		int a[] = {15, 24, 35, 356, 341, 25};
		calculateAverageWithArray(a);
		
		int b[] = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		calculateAverageWithArray(b);
		
		average(1);
		average(1, 2, 3, 4);
		average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		average(0xAB);
		
		// anotherAverage(2, true, 3, 4, 5);
		
	}
	
	//Method with 2 arguments
	public static void calculateAverage(int x, int y) {
		System.out.println("Average: " + (double) ( x + y ) / 2);
	}

	
	// Method with three arguments and goes on!
	
	public static void calculateAverage(int x, int y, int z) {
		System.out.println("Avrage: " + (double) (x + y + z) /2);
	}
	 
	// Method with array arguments. But it needs to be called by providing an array
	public static void calculateAverageWithArray(int[] array) {
		
		int sum = 0;
		int i = 0;
		for (int x : array) {
			sum += x;
			i++;
		}
		
		System.out.println("Average: " + (double) sum / i);
	}
	
	public static void average (int ... array) {
	
		int sum = 0;
		int i = 0;
		for (int x : array) {
			sum += x;
			i++;
		}
		
		System.out.println("Average: " + (double) sum / i);
	}
		
}
	