// 5. Take 2 numbers as input and print the largest number.

package com.learn;
import java.util.Scanner;

public class FindBiggerNumber {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		if(num1 == num2) {
			System.out.println("Both numbers are equal.");
		}
		else if(num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		}
		else {
			System.out.println(num2 + " is greater than " + num1);
		}
		input.close();
	}
}