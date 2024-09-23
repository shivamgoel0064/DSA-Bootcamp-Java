// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package com.learn;
import java.util.Scanner;

public class CalculateSimpleInterest {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Principal : ");
		float p = input.nextFloat();
		System.out.print("Time Interval (in years) : ");
		float t = input.nextFloat();
		System.out.print("Rate of Interest (p.a.) : ");
		float r = input.nextFloat();
		float si = (p * r * t) / 100;
		System.out.println("Simple Interest -> Rs. " + si);
		input.close();
	}
}
