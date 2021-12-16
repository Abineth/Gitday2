package org.pojo;

public class Employee {
	public static void main(String[] args) {
		Company a = new Company();
		
		a.setUsername("java");
		
		String username = a.getUsername();
		System.out.println(username);
	}

}
