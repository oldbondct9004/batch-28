package com.day5;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheVowels {

	private ArrayList  vowels = new ArrayList(Arrays.asList('a', 'e','i','o','u'));
	
	public void findNoOfVowels(String str){
		int noOfVowels=0;
		char [] c = str.toLowerCase().toCharArray();
		for(int i=0 ; i<c.length;i++) {
			if(vowels.contains(c[i])){
				noOfVowels++;	
			}
		}
		
		System.out.println("Number of Vowels is: " + noOfVowels);
	}
	
	public void reverseOfString(String str) {
		
		int lengthOfStr = str.length();
		char [] orgChar = str.toCharArray();
		char [] revChar = new char[lengthOfStr];
		int j=0;
		for (int i= (lengthOfStr-1) ; i >= 0 ; i--){
			revChar [j] = orgChar[i];
			j++;
		}
		System.out.println("Reverse of a string: " + String.valueOf(revChar));
	}
	
	public void checkMaxAndMinValues(int [] numbers) {
		
		int minValue=0;
		int maxValue=0;
		
		for (int i=0; i < numbers.length; i++){
			
			if(i == 0) {
				maxValue = numbers[i];
				minValue = numbers[i];
			}
			
			if(numbers[i] >= maxValue){
				maxValue = numbers[i];
			} else if(numbers[i] <= minValue) {
				minValue = numbers[i];
			}
					
		}
		
		System.out.println("Minimum value: " +minValue);
		System.out.println("Maximum value: " +maxValue);
		
	}
	
}
