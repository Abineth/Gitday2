package org.prog;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=10;
		a[4]=40;
		
		Set<Integer> s = new LinkedHashSet<>();
		for(int i=0; i<a.length; i++) {
			s.add(a[i]);
		}
		for(Integer array:s) {
			System.out.println(array);
		}

	}

}
