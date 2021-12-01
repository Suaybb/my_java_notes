package java_notes.ch05.loop;

public class WhileDemo {
	
	public static void main(String[] args) {
		
		int iterationCount = 0;
		double r = Math.random();
		System.out.println("r: " + r);
		
		while(r < 0.8) {
			r = Math.random();
			System.out.println("in while: " + r);
			iterationCount++;
		}
		
		System.out.println("After while");
		System.out.println("Total iteration: " + iterationCount);
	}
	
}
