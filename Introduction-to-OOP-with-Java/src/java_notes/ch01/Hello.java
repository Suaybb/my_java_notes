package java_notes.ch01;

public class Hello {
	String world = "everyone";
	
	public String sayHello(String whom) {
		String sentence;
		
		if(whom != "") 
			sentence = "Hello " + whom + " :)";
		else 
			sentence = "Hello " + world + " :)";
		return sentence;
	}
}
