package com.spaceship.member;

public class FindPercentage {

	
	public static void main(String[] args) {
		
		String input_string = "Tiger Runs @ The Speed Of 100 km/hour.";
		int i = 0;
		int size = input_string.length();
		float upperCaseCount = 0;
		float lowerCaseCount = 0;
		float specialCharCount = 0;
		float numberCount = 0;
		
		
		while(i<size) {
			int ch = input_string.charAt(i);
			if(ch<=90 && ch >=65) upperCaseCount++;
			else if(ch<=57 && ch >=48) numberCount++;
			else if(ch<=122 && ch >=97) lowerCaseCount++;
			else specialCharCount++;
			i++;
		}
		System.out.println("percentage of Uppercase Letters "+((upperCaseCount*100)/size));
		System.out.println("percentage of Lowercase Letters "+((lowerCaseCount*100)/size));
		System.out.println("percentage of Numbers "+(numberCount*100)/size);
		System.out.println("percentage of Other Special Charactors "+(specialCharCount*100)/size);
	}
	
}
