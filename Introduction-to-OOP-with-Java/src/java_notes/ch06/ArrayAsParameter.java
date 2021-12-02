package java_notes.ch06;

public class ArrayAsParameter {
	
	public static void main(String[] args) {
		int[] array1 = new int[3];
		array1[0] = 17;
		array1[1] = 124;
		array1[2] = 11;
		
		calculateTotal(array1);
		
		int[] array2 = {45, 511, -44};
		calculateTotal(array2);
		
		calculateTotal(new int[] {41, 66, 92});
		
		calculateTotal(new int[3]);
		
		// calculateAverage({ 42, 55, 12}); // Problem cos of untyped parameter
	}
	
	public static void calculateTotal(int[] array) {
		double total = 0;
		
		for(int i : array)
			total += i;
		System.out.println("Total of array: " + total);
	}
	
	
}
