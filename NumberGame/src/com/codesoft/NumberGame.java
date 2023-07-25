package com.codesoft;

import java.util.Scanner;

public class NumberGame {

	/**
	 * @param args
	 */
	 static int c;
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input you Guess ");
		int n=sc.nextInt();
		
	
			c++;
			if(n==RandomNumber.randomNumber){
				if(c<5) {
					System.out.println("You are Genius you have guess in "+c+ "attampts");
				}
				else System.out.println("Great job you have guessed in "+c+" attampts");
				return ;
			}
			else if(n>RandomNumber.randomNumber) {
				System.out.println("Your guess is to High");
				main(args);
			}
			else {
				System.out.println("Your guess is to low");
				main(args);
			}
		}

	

}
