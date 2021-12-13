package java_notes.ch10.ObjectClass;

public class EqualityExample {

	
	public static void main(String[] args) {

		Product p1 = new Product(1, "Bilgisayar" , 5000);
		Product p2 = new Product(1, "Bilg isayar" , 5000);
		

		// boolean b = p1==p2; cos of different reference in memory
		
		boolean b = p1.equals(p2);
		
		if(b)			
			System.out.println("p1 - p2 are equals" );
		else
			System.out.println("p1 - p2 are different");	
	}
}

class Product {
	
	int no;
	String name;
	int price;
	
	Product (int no, String name, int price) {
		
		this.no = no;
		this.name = name;
		this.price = price;
		
	}
	
	public boolean equals(Object o) {
		
		Product product = (Product)o;
		boolean b = false;
		if(product.no == no)
			b = true;
		return b;
		
	}
		
}











