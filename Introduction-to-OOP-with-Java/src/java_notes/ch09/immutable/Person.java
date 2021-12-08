package java_notes.ch09.immutable;

// Functional Programming example
// Funtional Person class
public final class Person {

	private final String no;
	private final String name;
	private Address address;
	
	public Person (String no, String name, Address address) {
		
		this.no = no;
		this.name = name;
		this.address = address;
		
	}
	
	public String getNo() {
		
		return no;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setAddress(Address address) {
		
		this.address = address;
		
	}
	
	public Address getAddress () {
		
		Address newAddress = new Address(address);
		System.out.println("Address: " + address.getName());
		System.out.println("New Address: " + newAddress.getName());
		
		return newAddress;
		
	}
			
}













