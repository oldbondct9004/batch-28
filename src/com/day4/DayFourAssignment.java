package com.day4;

import com.day2.Student;

public class DayFourAssignment {

	public static void main(String[] args) {
		// Write a program to print your name to console.
		Student stu = new Student();
		AgeDetermination ad = new AgeDetermination();
		stu.setName("Pavan");
		System.out.println("Name is:" + stu.getName());
		
	// Given person age, Write a function that will print if the person is kid , teen or adult.
		ad.guessAge(0);
		ad.guessAge(25);
		ad.guessAge(16);
		ad.guessAge(9);
		
	//FizzBuzz program

		for(int i=0 ; i < 100 ; i++) {
			if((i%3 == 0) && (i%5 == 0) ){
				System.out.print(" FizzBuzz ");
			} else if (i%5 == 0) {
				System.out.print(" Buzz ");
			} else if (i%3 == 0) {
				System.out.print(" Fizz ");				
			} else {
				System.out.print(" "+ i + " ");				
			}
		}
		
		System.out.println(" ");
		
//		write a program to print Fibonacci Series up to the N term.
//		0 1 1 2 3 5 8 
		int previousNo=0;
		int currentNo = 1 ;
		
		System.out.print(" "+ previousNo);
		System.out.print(" "+ currentNo);
		
		for(int j=0; j < 10; j++) {
			int febNo = previousNo + currentNo;
			System.out.print(" "+ febNo);
			previousNo = currentNo;
			currentNo = febNo;
		}
		System.out.println(" ");
		
	}
	

}
