package org.emp;

public class Singleton {
	public static Singleton a;
	
	public static Singleton getObject() {
		if(a==null) {
			int beforeObj = System.identityHashCode(a);
			System.out.println(beforeObj);
			
			a= new Singleton();
			int afterObj = System.identityHashCode(a);
			System.out.println(afterObj);
		}
		return a;
	}
	
	private void learnId() {
		System.out.println("learning");
	}
	
	public static void main(String[] args) {
		Singleton obj = getObject();
		obj.learnId();
		
		Singleton obj2 = getObject();
		int secondObj = System.identityHashCode(obj2);
		System.out.println(secondObj);
	}

}
