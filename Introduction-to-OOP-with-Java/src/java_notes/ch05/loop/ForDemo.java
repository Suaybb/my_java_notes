package java_notes.ch05.loop;

public class ForDemo {
	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++)
			sum += i;
			System.out.println("Sum: " + sum);
			
			System.out.println("\nMultiplication Table");
			
			for(int i = 1; i <= 10; i++) {
				for(int j = 1; j <= 10; j++) {
					System.out.format("%4d", i * j);
				}
				System.out.println("");
			}
			
			System.out.println("Fibonacci Numbers");
			
			
			int num1 = 1;
			int num2 = 1;
			int fibonacciNumber;
			
			for(int i = 3; i <= 20; i++) {
				fibonacciNumber = num1 + num2; 
				System.out.format("%10d", fibonacciNumber);
				num1 = num2;
				num2 = fibonacciNumber;
				
				if(i % 5 == 0) {
					System.out.println("\n");
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
