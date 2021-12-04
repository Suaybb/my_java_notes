package java_notes.ch08.init.constructor.argConst;

public class Tree {
	
	String type;
	float height;
	
	public Tree (String newType, float newHeight) {
		type = newType;
		height = newHeight;
	}
	
	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}
	
	public static void main(String[] args) {
		Tree tree1 = new Tree("Apple" , 3.0f);
		
		tree1.printInfo();
	}
	
	
	
}
