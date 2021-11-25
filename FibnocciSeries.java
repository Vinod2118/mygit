package com.practice.program;

public class FibnocciSeries {

	public static void main(String[] args) {

		int f=0, f1=1, f2;
		System.out.println(f+" ");
		System.out.println(f1+" ");
		
		for(int i=1; i<=6; i++)
		{
			f2=f+f1;
		
		System.out.println(f2+" ");
		f=f1;
		f1=f2;
		}
	}

}
