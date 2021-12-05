package java_notes.ch08.init.constructor.thisCall.bank;

public class Customer {

	int id;
	String name;
	
	CreditCard creditCard;
	
	Customer(int id, String name) {
	
		this.id = id;
		this.name = name;
	
	}
	
	public void setCreditCard(CreditCard creditCard ) {
	
		this.creditCard = creditCard;
	
	}
	
	public void print() {
		
		System.out.println("Customer id: " + id + " Customer name: " + name + " and has a credit card which number " + creditCard.no);
		
	}
	
	
}
