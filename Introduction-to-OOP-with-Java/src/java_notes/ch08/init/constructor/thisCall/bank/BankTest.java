package java_notes.ch08.init.constructor.thisCall.bank;

public class BankTest {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(1, "Suayb");
		CreditCard cc1 = new CreditCard("123", 50.12);
		
		c1.setCreditCard(cc1);
		cc1.setCustomer(c1);
		
		c1.print();
		cc1.print();
		
		System.out.println("*************************");
		
		// Alternatively
		
		Customer c2 = new Customer(2, "Elif");
		CreditCard cc2 = new CreditCard("345", 542.23, c2);
		
		c2.print();
		cc2.print();
		
		
	}
		
}
