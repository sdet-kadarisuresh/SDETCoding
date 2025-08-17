package com.coding.controlflow;

public class nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
		boolean hasVoterID = true;

		if (age >= 18) {
		    if (hasVoterID) {
		        System.out.println("Can vote");
		    } else {
		        System.out.println("Need voter ID to vote");
		    }
		} else {
		    System.out.println("Too young to vote");
		}

	}

}
