// Write a program to print whether a number is even or odd, also take input from the user.

package com.learn;

import java.util.Scanner;

public class CheckOddEven {

	public static void main (String[] args) {
		
		System.out.println("Enter a number : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + " is an even number");
		}
		else {
			System.out.println(num + " is an odd number");
		}
	}
}
