package java_notes.ch07.init;

public class InitialValues {
	
	// Instance variables
	boolean t;  // false
	char c;		// 0
	byte b;		// 0
	short s;    // 0
	int i;		// 0
	long l; 	// 0.0
	float f;	// 0.0
	double d; 	// 0.0
	String str; // null
	
	
	void print() {
		System.out.println(
				"Data type      Initial values for instance variables\n"+
				"Boolean 		"+ t + "\n" +
				"char           [" + c + "]  " + (int)c + "\n" + // int olarak 0
 				"byte 			"+ b + "\n" +
				"short 			"+ s + "\n" +
				"int 			"+ i + "\n" +
				"long  			"+ l + "\n" + // 64 bit
				"float 			"+ f + "\n" + // 32 bit
				"double 		"+ d + "\n" + // 64 bit
				"string 		"+ str + "\n" );
	}
	
	public static void main(String[] args) {
		InitialValues obj = new InitialValues();
		obj.print();
	}
	
}
