package org.prog;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharOccurence {
	public static void main(String[] args) {
		String s = "Abineth Vijay";
		
		Map<Character, Integer> m = new LinkedHashMap<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(m.containsKey(c)) {
				Integer integer = m.get(c);
				m.put(c, integer+1);
			}
			else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
