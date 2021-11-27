package java_notes.ch02;

/**
 * @author SuaybKiris
 * 
 * That's a <b>Javadoc</b> comment!	
 */

public class Comments {
	
		
	private String name = "Comments"; // That's just a string
	
	/**
	 * This method calculates the double of passed parameter and returns it.
	 * 
	 * @param x       The value to be doubled.
	 * @return        Double if the value of x passed as parameter
	 */
	
	public int doubleIt(int x) {
		
		/*
		 * That's a comment block/traditional!
		 */
		return 2 * x; // Just multiply x by 2!
	}
}
