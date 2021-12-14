package java_notes.ch11.string;

public class StringPerformanceTest {

	public static void main(String[] args) {
		
		//buildStringWithPlus("java", 1_000_000);
		//buildStringWithStringBuilder("java", 1_000_000);
		buildStringWithStringBuffer("java", 1_000_000);
		
	}
	
	
	public static void buildStringWithPlus(String string, int count) {
		
		long start = System.currentTimeMillis();

		for(int i = 0; i < count; i++) {

			string = string + i;
		
		}

		long end = System.currentTimeMillis();
		System.out.println("BuildStringWithPlus: Time to build string is " + (end - start) + " ms.");
		System.out.println("String length: " + string.length());

	}
	
	public static void buildStringWithStringBuilder(String string, int count) {
		
		StringBuilder sb = new StringBuilder(string);
		
		long start = System.currentTimeMillis();

		for(int i = 0; i < count; i++) {

			sb.append(i);
		
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("BuildStringWithStringBuilder: Time to build string is " + (end - start)+ " ms.");
		System.out.println("String lenght: " + sb.toString().length());
		
	}
	
	public static void buildStringWithStringBuffer(String string, int count) {
		
		StringBuffer sb = new StringBuffer(string);
		
		long start = System.currentTimeMillis();

		for(int i = 0; i < count; i++) {

			sb.append(i);
		
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("BuildStringWithStringBuffer: Time to build string is " + (end - start)+ " ms.");
		System.out.println("String lenght: " + sb.toString().length());
		
	}
	
	
	
	
}
