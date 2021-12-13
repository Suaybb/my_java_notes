package java_notes.ch10.inheritance.overriding;

public class RestrictiveOverriding {

	public static void main(String[] args) {
		
		Parent p = new Parent();
	
		p.f();
		
		System.out.println(p.i);
		
		Child c = new Child();
		c.f();
		
		//System.out.println(c.i);
	
	}
	
}


class Parent {
	
	public int i = 8;

	public void f() {
		
	}
}


class Child extends Parent {
	
	private int i = 9;
	
	// We can't use like that, cos parent class f() function is public modifier so only accept public modifier
	//protected void f
	//private void f
	//void f 
	
	// But If parent class modifer private or default, it's name called Extension 
	// Then we can use protected or public Everyting is depend on parent class modifier

	@Override
	public void f() {
	  	
	}
	
	
}
















