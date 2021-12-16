package org.prog;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordOccurence {
	public static void main(String[] args) {
		String s = "TestNG Framework is the most important Framework";
	Map<String, Integer> m = new LinkedHashMap<>();
	
	String[] split = s.split(" ");
	for (String s1 : split) {
		if (m.containsKey(s1)) {
			Integer integer = m.get(s1);
			m.put(s1, integer+1);
		}
		else {
			m.put(s1, 1);
		}
		
	}
	System.out.println(m);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
