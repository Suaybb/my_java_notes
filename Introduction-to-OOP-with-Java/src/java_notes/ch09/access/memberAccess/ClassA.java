package java_notes.ch09.access.memberAccess;

import java_notes.ch09.access.memberAccess.p.ClassAA;

public class ClassA {

		public static void main(String[] args) {
			
			ClassAA aa = new ClassAA();
			
			System.out.println(aa.x);
			
			// Default identifier
		 //	System.out.println(aa.y);
			
			// Protected
		 //	System.out.println(aa.w);
	
			// Private
		 // System.out.println(aa.z);
		
		// same goes for methods
			
			aa.publicMethod();
			
	   	 //	aa.protectedMethod();
		 //	aa.defaultMethod();
		 // aa.privateMethod();
			
		}
	
	
}
