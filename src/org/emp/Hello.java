package org.emp;

public class Hello extends Abstraction{
	
	@Override
	public void add() {
		System.out.println("addition of two numbers");
		
	}
	@Override
	public void test() {
		this.add();
		System.out.println("test");
		super.sample();
	}
	public static void main(String[] args) {
		Hello a = new Hello();
		a.test();
	}
	
	
	
	
	
	
	
}
