package com.practice.program;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		
		int num=scan.nextInt();
		int rev=0, rem,temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=(rev*10)+rem;
		}
		
		System.out.println("reverse of number is :"+rev);
		
		if(temp==rev) {
			System.out.println("your number is Pallindrome number");
		}
		else{
			System.out.println("your number is not Pallindrome number");
		}
	}

}
