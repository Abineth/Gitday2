package org.prog;
//Count of letters, numbers & special characters
public class Count {
	public static void main(String[] args) {
		String s = "JavaProgram@123";
		int lower_case = 0;
		int upper_case = 0;
		int number = 0;
		int special_character = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c>='a' && c<='z') {
				lower_case++;
				}
			else if (c>='A' && c<='Z') {
				upper_case++;
			}
			else if(c>='0' && c<='9') {
				number++;
			}
			else {
				special_character++;
			}
		}
		System.out.println("Lowercase letters "+lower_case);
		System.out.println("Uppercase letters "+upper_case);
		System.out.println("Numbers "+number);
		System.out.println("Special Characters "+special_character);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
