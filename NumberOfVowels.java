package com.technoelevate.string;

import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the sentance....");
		String s1=scan.nextLine();
		s1=s1.toLowerCase();
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'|| ch=='u') {
				count++;
			}
		}
		
		System.out.println("Total vowles are :"+count);
	}

}
