package com.practice.program;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the number ");
		
		int num=scan.nextInt();
		int rev=0, rem, temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			rev=rev+(rem*rem*rem);
		}
		
		if(temp==rev) {
			System.out.println(" your number is Armstrong number");
		}
		else {
			System.out.println(" your number is not Armstrong number");
		}
	}

}
