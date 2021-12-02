package java_notes.ch06;

public class MainDemo {
	
	public static void main(String[] args) {
		
		if(args.length == 3) {
			String name = args[0];
			String lastName = args[1];
			String age = args[2];
			System.out.println("Name: " + name + " lastname: " + lastName + " age: " + age);
		} else {
			System.out.println("Please provide three arguments!");
			System.exit(1);
		}
		
		for(String info : args) 
			System.out.println("Info : " + info);
	
		int age = Integer.parseInt(args[2]);
		System.out.println(age * 2);
		
	}
	
}
