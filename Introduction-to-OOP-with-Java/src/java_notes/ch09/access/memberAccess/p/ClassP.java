package java_notes.ch09.access.memberAccess.p;

public class ClassP {
	
	public static void main(String[] args) {
		
		ClassAA aa = new ClassAA();
		
		System.out.println(aa.w);
		System.out.println(aa.x);
		System.out.println(aa.y);
	 // System.out.println(aa.z);
	
		aa.publicMethod();
		aa.protectedMethod();
		aa.defaultMethod();
	 // aa.privateMethod();
		
		
	}
	
}
