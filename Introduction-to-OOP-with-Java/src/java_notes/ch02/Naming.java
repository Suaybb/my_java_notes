package java_notes.ch02;

/** 
 * An example to show how code conventions are applied when naming in a Java class. 
 */


public class Naming {
	
	private int anIntegerVariable;
	private double aDoubleVariable;
	
	public static void main(String[] args) {
		
		Naming namingDemo = new Naming();
		namingDemo.anIntegerVariable = 100;
		namingDemo.aDoubleVariable = 23.4;
		namingDemo.aSimpleMehtod(2,  6);
		namingDemo.anotherSimpleMethod(8, 0, false);
		
	}
	
	public void aSimpleMehtod(int aParameter, int anotherParameter) {
		System.out.println("in aSimpleMethod(int aParameter, int anotherParameter)");
	}
	
	public void anotherSimpleMethod(int aParameter, long anotherParameter, boolean yetAnotherParameter) {
		System.out.println("in anotherSimpleMethod(int aParameter, long anotherParameter, boolean yetAnotherParameter)");
	}
	
}
