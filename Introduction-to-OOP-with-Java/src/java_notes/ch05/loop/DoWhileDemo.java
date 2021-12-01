package java_notes.ch05.loop;

public class DoWhileDemo {
	
		public static void main(String[] args) {
			double r;
			
			do {
				r = Math.random();
				System.out.println("in do-while: " + r);
			}while(r < 0.8);
		}
}
