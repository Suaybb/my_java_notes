package java_notes.ch08.init.constructor.thisCall.bank;

public class CreditCard {

	String no;
	double balance;
	
	Customer customer;
	
	CreditCard(String no, double balance) {
	
		this.no = no;
		this.balance = balance;
	
	}
	
	
	CreditCard(String no, double balance, Customer customer) {
	
		this.no = no;
		this.balance = balance;
		this.customer = customer;
		customer.setCreditCard(this);
	
	}
	
	
	
	public void setCustomer(Customer customer) {
		
		this.customer = customer;
		
	}
	
	public void print() {
	
		System.out.println("Credit card no: " + no + " Balance: " + balance + " and it belongs to " + customer.name);
	
	}
	
	
	
	
}
