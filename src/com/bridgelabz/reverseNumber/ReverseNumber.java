package com.bridgelabz.reverseNumber;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String args[]) {

		int number;
		
		Scanner s = new Scanner(System.in);
		
		number = s.nextInt();
		
		int reversedNumber = 0;
		
		while (number != 0) {
			int lastNumber = number % 10;
			reversedNumber = (reversedNumber * 10) + lastNumber;
			number = number / 10;
		}
		
		System.out.println("The reversed number is " + reversedNumber);
	}

}
