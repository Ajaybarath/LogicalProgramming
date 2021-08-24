package com.bridgelabz.stopwatchStimulator;

import java.util.Scanner;

public class StopwatchStimulator {
	
	public static void main(String args[]) {

		long startTime = System.currentTimeMillis();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 1 to start");
		System.out.println("Enter 0 to stop");
		
		while(true) {
			
			int value = s.nextInt();
			if (value == 1) {
				startTime = System.currentTimeMillis();
			}
			if (value == 0) {
				break;
			}
		}
		
		// ... do something ...
		long estimatedTime = System.currentTimeMillis() - startTime;
		
		estimatedTime = estimatedTime/1000;
		
		System.out.println(estimatedTime);
		
	}
	

}
