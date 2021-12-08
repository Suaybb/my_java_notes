package java_notes.ch09.immutable;

import java.util.List;

public class Test {
	
	public static void main(String[] args) {
				
		Address addr = new Address("Uskudar", null, "Uskudar", "Istanbul", "1234" );
		Person person = new Person("1", "Suayb", addr);
		
		person.getAddress();
		person.setAddress(addr);
		person.getAddress();
		
		
	}
	
}
