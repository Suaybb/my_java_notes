package java_notes.ch03.references;

public class PrimitivesAndReferences {
	
	public static void main(String[] args) {
		
		// First primitive variables
		int i = 5;
		int j = i;
		i = 7;
		
		System.out.println("i: " + i + "\t" + " j: " + j ); // j is still 5
		
		System.out.println();
		
		// Reference variables
		String s1 = new String("http://www.google.com.tr"); // s1 => "http://www.google.com.tr"
		String s2 = new String("http://www.microsoft.com"); // s2 => "http://www.microsoft.com"
		
		System.out.println("Before switch => s1: " + s1 +  " \t" + "s2: " + s2 );
		
		// Let's switch references
		
		String tmp = s1; // tmp => "http://www.google.com.tr", There are two reference to same point
	
		s1 = s2; // s1 => "http://www.microsoft.com", s1 and s2 are reference to same point memory
		
		s2 = tmp;// s2 => "http://www.microsoft.com", now tmp and s2 are reference to same point memory 
	
		System.out.println("After switch => s1: "+ s1 + " \t" + "s2: " + s2);
	
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2 + " \t" + "tmp: " + tmp);	
	
	}	
}
