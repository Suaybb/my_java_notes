package java_notes.ch08.init.constructor.thisCall;

public class Tree {
	
	String type;
	float height;
	
	// Smart and clean constructor :)
	public Tree(String newType, float newHeight) {
	
		type = newType;
		height = newHeight;
	
	}
	
	// Method overloaded
	Tree(String newType) {
	
		// DRY (Dont repeat yourself)
		// type = newType;
		// height = 1.0f;
		this(newType, 1.0f);
	
	}
	
	// Method overloaded
	Tree(float newHeight) {
	
		// DRY (Dont repeat yourself)
		// type = "Pine";
		// height = newHeight;
		this("Pine", newHeight);
	
	}
	
	// Method overloaded
	Tree() {
		
		// DRY (Dont repeat yourself)
		// type = "Pine";
		// height = 1.0f;
		this("Pine", 1.0f);
	
	}	
		
}
