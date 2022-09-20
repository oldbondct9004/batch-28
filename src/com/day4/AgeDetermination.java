package com.day4;

public class AgeDetermination {

	public void guessAge(int age){
		
		if(age >=19 ){
			System.out.println("You're a auult");
		}else if (age >=13 && age < 19){
			System.out.println("You're in teen age");
		}else{
			System.out.println("You're a Kid");			
		}
		
	}
}
