package java_notes.ch05.decision;

public class IfElseDemo {
	
	public static void main(String[] args) {
		
		String testScore = args[0];
		int score = Integer.parseInt(testScore);
		
		char grade;
		
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
	
		System.out.println("Your grade is: " + grade);
		
		if (grade < 'C')
			System.out.println("U need to work");
		if (grade == 'A' | grade == 'B')
			System.out.println("Congrulations");
		if (grade == 'F')
			System.out.println("Poor student..");
		
	}
}
