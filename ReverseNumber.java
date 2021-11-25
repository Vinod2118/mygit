package com.practice.program;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the number ");
		 
		int num = scan.nextInt();
		int rev=0,rem;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse of num is :"+rev);
	}

}
