package com.technoelvate.collectionshoppingcart;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		System.out.println("Enter the Value :");
		System.out.println("press one view the elements  ");
		System.out.println("press two add the elements  ");
		System.out.println("press three remove the elements  ");
		System.out.println("press four modify the elements  ");
		System.out.println("press five exit the elements  ");
		
		Scanner scan = new Scanner(System.in);
		
		int no=scan.nextInt();
		while(no!=5) {
			switch (no){
			case 1: System.out.println(" Enter the number of items ");
					int i=scan.nextInt();
					while(i>0) {
						System.out.println(" Enter the  item name ");
						String s=scan.next();
						al.add(s);
						i--;
					}
					break;
			case 2: for (int j = 0; j < al.size(); j++) {
				System.out.println(al.get(j));
			}
			
			break;
			case 3 :System.out.println("Enter the value lenth ");
					int k=scan.nextInt();
					System.out.println(al.get(k));
			
			break;
			case 4: System.out.println("enter the modify item");
					int l=scan.nextInt();
					
					System.out.println("Enter the modify item name");
					String st=scan.next();
					al.remove(l);
					al.add(l,st); 
					break;
					
					default:
					}
			System.out.println(" Thank you");
			}
	}
		
	}

