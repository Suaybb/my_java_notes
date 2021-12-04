package java_notes.ch08.init.constructor.noArg;

public class Tree {
	
	String type;
	float height;
	
	// No-Argument constructor (NoArgs)
	// Dummy constructor
	public Tree() {
		type = "Pine";
		height = 1.0f;
	}
	
	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}
	
	public static void main(String[] args) {
		
		Tree tree1 = new Tree();
		tree1.printInfo();; // Meaningful state
		
		Tree tree2 = new Tree();
		tree2.printInfo();
		
	}
	
}
