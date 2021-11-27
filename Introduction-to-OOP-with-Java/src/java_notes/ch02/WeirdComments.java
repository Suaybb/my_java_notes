package java_notes.ch02;

public class WeirdComments {
	
	public static void main(String[] args) {
		int /** */ i = 5;
		boolean b = /** */true;
		int k /** */ = i/** */++;
		
		System.out.println(i);
	}

}
