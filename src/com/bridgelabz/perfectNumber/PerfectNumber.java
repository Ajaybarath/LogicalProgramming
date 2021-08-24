package com.bridgelabz.perfectNumber;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String args[]) {

		int number;
		
		Scanner s = new Scanner(System.in);
		
		number = s.nextInt();
		
		int sum = 0;
		
		for (int i=1;i<number;i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		
		if (sum == number) {
			System.out.println("The given number is perfect number");
		}
		else {
			System.out.println("The given number is not perfect number");
		}
		
	}

}
