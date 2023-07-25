package com.codesoft;

public class RandomNumber {
	
	 static int upper=100;
	 static int lower=1;
	static  int randomNumber= (int) (Math.random() * (upper - lower)) + lower;

}
