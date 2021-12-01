package java_notes.ch05;

public class BreakAndContinueWithLabel {
	
	public static void main(String[] args) {
		
		int[][] arrayOfInts = { {23, 24, 11, 42}, {13, 44, 212, 455}, {32, 51, 76, 192}};
		
		int searchFor = 19;
		
		boolean foundIt = false;
		
		here : for(int i = 0; i < arrayOfInts.length; i++) {
			for(int j = 0; j < arrayOfInts[i].length; j++) {
				if(arrayOfInts[i][j] == searchFor) {
					foundIt = true;
					System.out.println("Found " + searchFor + " at " + i + ", "+ j);
					break here;
					// continue here:
				}
			}
		}
		
		if(!foundIt) {
			System.out.println(searchFor + " not in the array");
		}		
	}	
}
