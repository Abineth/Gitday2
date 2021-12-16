package org.prog;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int arm = 0;
		
		while(num>0) {
			int n = num%10;
			arm = arm+(n*n*n);
			num = num/10;
		}
		if (arm==temp) {
			System.out.println("The number is Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
	}

}
