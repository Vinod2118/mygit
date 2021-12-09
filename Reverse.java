package com.technoelevate.string;

public class Reverse {

	public static void main(String[] args) {

		String s1 = " Vinod";
		String s2= " ";
		
		for(int i=s1.length()-1; i>=0; i--){
			s2=s2+s1.charAt(i);	
		}
		System.out.println("Original String "+s1);
		System.out.println("Reversed String "+s2);
		
	}

}
