package java_notes.ch04;

/**
 * 
 * @author Suayb
 * This is an example that shows arithmetic promotions made in operators.
 */

public class ArithmeticPromotion {
	
	public static void main(String[] args) {
		
		byte b1 = 11;
		byte b2 = 22;
		// byte b3 = b1 + b2; // Compile error: possible loss of precision
		byte b3 = (byte) (b1  * b2);
		System.out.println(b3);

		int jj = 5;
		int kk = 2;
		
		System.out.println("5 / 2 = " + jj / kk);
		
		short s1 = 187;
		short s2 = 9;
		// short s3 = s1 * s2;
		short s3 = (short) (s1 / s2);
		System.out.println(s3);
		
		int i = 32;
		double d = 8.32214;
	 	// int k = i * d; // Compile error: possible loss of precision
		int k = (int) (i * d);
		System.out.println(k);
		
		// Compound assingments
		i = 5;
		d = 0.341521;
		long l = 12L;
		
		i = i + 3;
		i += 3;
		System.out.println(i);
		
		// i = i + l; // Need cast to int
		i += l;      // Automated cast to int
		System.out.println(i);
		i -= d;
		System.out.println(i);
	}
	
}
