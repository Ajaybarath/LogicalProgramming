package com.bridgelabz.primeNumber;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[]) {

		int number;
		boolean isPrime = true;
		
		Scanner s = new Scanner(System.in);
		
		number = s.nextInt();
		
		for (int i=2;i<number/2;i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("The given number is prime");
		}
		else {
			System.out.println("The given number is not prime");
		}
		
	}

}
