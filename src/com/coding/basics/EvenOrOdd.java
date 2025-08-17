package com.coding.basics;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" is Even");
		}
		else {
			System.out.println(num+" is Odd");

		}
		

	}

}
