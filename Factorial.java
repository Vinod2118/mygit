package com.practice.program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the Number ");
		
		int num = scan.nextInt();
		int fact = 1;
		for(int i=1;i<=num; i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial value is :" +fact);
	}

}

/*	int i=1, fact = 1;
while( i<=num) {
fact=fact*i;
i++;

}
System.out.println("Factorial value is :" +fact );
*/