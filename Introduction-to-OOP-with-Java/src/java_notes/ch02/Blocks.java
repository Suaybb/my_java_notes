package java_notes.ch02;

public class Blocks {
	
	long l;
	
	// Declaration block
	{
		boolean b;
	}
	
	// Initialization block
	{
		// b = true;
		l = 17L;
	}
	
	// Definition blokc
	{
		int i = 6;
	}
	
	// Method block
	public static void main(String[] args) {
		Blocks bd = new Blocks();
		System.out.println(bd.l);
	
		{
			int t = 5;
			System.out.println(t);
		} 
	}
	
	// Inner class block
	class InnerClass {
		
		public void f() {
			// Local class method
			new Blocks() {
				public void sop() {
					System.out.println(l);
				}
			};
		}
	}
}







