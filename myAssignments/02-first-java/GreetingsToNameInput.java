// Take name as input and print a greeting message for that particular name.

package com.learn;

import java.util.Scanner;

public class GreetingsToNameInput {
	public static void main (String[] args) {
		System.out.println("Please enter your name : ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Hey " + name + "! How you doing? ");
	}
}