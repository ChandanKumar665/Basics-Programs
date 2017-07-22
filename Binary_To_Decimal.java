//package com.github.chandankumar665.binarytodecimal;
import java.util.Scanner;
public class Binary_To_Decimal {
	static long input_no,binary_no;
	static long remainder;
	static int exponential=0;
	static double decimal=0;
	public static void main(String[]args) {
	Scanner in=new Scanner(System.in);
    System.out.println("Enter a binary no:");
	input_no=in.nextLong();
	binary_no=input_no;
	//first we will check that input no is binary or not
	while(input_no!=0) {
		remainder=input_no%10;
		if(remainder==0||remainder==1) {
			input_no=input_no/10;
		}
		else {
			break;
		}
	}
	if(input_no==0) {
	System.out.println("input no is a binary no");	
	while(binary_no!=0) {
		remainder=binary_no%10;
		decimal=decimal+remainder*Math.pow(2,exponential);
		binary_no=binary_no/10;
		exponential++;		
	}
System.out.println("The converted decimal no is "+decimal);	
	}
	else {
		System.out.println("The input no is not a binary no. pls enter a valid binary no");
		
		}
}
	
	
	
}