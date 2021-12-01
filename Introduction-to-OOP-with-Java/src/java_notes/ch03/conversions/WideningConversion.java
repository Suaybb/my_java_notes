package java_notes.ch03.conversions;

public class WideningConversion {
	
	public static void main(String[] args) {
		
		byte b =126;
		short s = 1294;
		char c = 65;
		int i = 2_147_483_647;
		long l;
		float f = 3.14f;
		double d;
		
		/**
		 * c = b; // compile error: possible lose of precision c = s; 
		 * compile error: possible loss of precision i = d; // compile error: loss of precision possible
		 */
		
		s = b;
		l = i;
		
		// Loss if precision
		f = i;
		System.out.println("i: " + i + " f: " + f);
		
		l = i + 1;
		System.out.println("i: " + i + " l: " + l);
		System.out.println();
		// Loss of precision
		l = 987_654_321_123_456_789L;
		f = l;
		System.out.println("l: " + l + " f: " + f);
		
		d = l;
		System.out.println("d: " + d + " l: " + l);
		
		d = f;
		System.out.println("d: " + d + " f: " + f);
		
		i = c;
		System.out.println("i: " + i + " c: " + c);
		
		d = i;
		System.out.println("d: " + d + " i: " + i);
						
	}

}
