package java_notes.ch03;

public class ScopeDemo {
	
	// Instance variable
	private int i = 1;
	
	// private String i = "Hello man";
	
	public static void main(String[] args) {
		int i = 0;
		System.out.println(i);
		// int i = 2; Duplicated variable
		
		for(; i < 5; i++) {
			System.out.println(i);
			if(i < 3) {
				// Can't say this.
				// boolean i = true;
				int ii = 3;
				int a;
				f(ii);
			} else if(3 < i & i < 12) {
				int ii = 8;
				f(ii);
			} else {
				int ii = 17;
				f(ii);
			}
		}
	}	

	public static void f(int i) {
		// Can't say this.
		// int i = 4;
		System.out.println(i);
	}

	public void f() {
		System.out.println(i);
	}
	
	public void ff() {
		int i = 6;
		System.out.println(i);
	}
	
	/***
	 * Can't reference a variable that is defined later in the scope.
	 */
	
	public void forwardReference() {
		// int i = j;
		// int j = 7;
		System.out.println(i);
	}	
}
