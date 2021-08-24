package com.bridgelabz.fibonacciNumber;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String args[]) {
		
		int fibonacciLimit = 0;
		
		Scanner s = new Scanner(System.in);
		
		fibonacciLimit = s.nextInt();
		
		int previousNumber = 1;
		int currentNumber = 1;
		
		System.out.print(previousNumber + ", " + currentNumber);
		
		for (int i=0;i<fibonacciLimit;i++) {
			int nextNumber = previousNumber + currentNumber;
			
			previousNumber = currentNumber;
			currentNumber = nextNumber;
			
			System.out.print(", " + nextNumber);
		}
		
	}

}
