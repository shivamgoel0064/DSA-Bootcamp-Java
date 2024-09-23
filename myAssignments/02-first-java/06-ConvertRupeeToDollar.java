// 6. Input currency in rupees and output in USD.

package com.learn;
import java.util.Scanner;

public class ConvertRupeeToDollar {
	public static void main (String[] args) {
		float rupeesPerDollar = 83.53f;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter amount in Rupees : ");
		float amountRupees = input.nextFloat();
		float amountDollar = amountRupees / rupeesPerDollar;
		System.out.println("Amount in Dollars : " + amountDollar);
		input.close();
	}
}
