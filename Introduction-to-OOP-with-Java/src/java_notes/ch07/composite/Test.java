package java_notes.ch07.composite;

public class Test {
	
	
	public static void main(String[] args) {
		
		Person suayb = new Person();
		
		suayb.tckn = "1";
		suayb.firstName = "Suayb";
		suayb.lastName = "Kiris";
		
		Car bmw = new Car();
		bmw.make = "BMW";
		bmw.model = "5.20";
		bmw.year = "2018";
		bmw.speed = 180;
		bmw.distance = 32_421;
		
		// That's how the relationship/association is established
		// That's a bi-directional, 1-1 association
		
		suayb.vehicle = bmw;
		bmw.owner = suayb;
		
		bmw.speed = 240;
		bmw.go(4322); 
		
		System.out.println(suayb.getInfo());
		System.out.println(bmw.getInfo());
		
		
	}

	
	
	
	
}
