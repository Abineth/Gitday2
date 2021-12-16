package org.prog;

public class VowelCount {
	public static void main(String[] args) {
		String s = "abineth vijay";
		int vowel_count = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
				vowel_count++;
			}
		}
		System.out.println("Vowel count = "+vowel_count);
	}
	

}
