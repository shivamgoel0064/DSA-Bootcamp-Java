// 8. To find out whether the given String is Palindrome or not.

package com.learn;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		long num1 = input.nextLong();
		long num2 = input.nextLong();
		List<Long> armstrongNums = new ArrayList<Long>();
		for(long num = num1; num<=num2; num++) {
			if(isArmstrongNum(num)) {
				armstrongNums.add(num);
			}
		}
		if(armstrongNums.size()>0) {
			printList(armstrongNums);
		}
		else {
			System.out.println("No armstrong numbers are present between the given numbers");
		}
		input.close();
	}
	private static void printList(List<Long> nums) {
		for(Long num : nums) {
			System.out.print(num + " ");
		}
	}
	private static boolean isArmstrongNum(long number) {
		long sum = 0, num = number;
		int rem;
		long product;
		int digitCount = getDigitCount(num);
		for(int i=0; i<digitCount; i++) {
			rem = (int) (num % 10);
			product = power(rem,digitCount);
			sum = sum + product;
			num = num / 10;
		}
		if(number == sum) {
			return true;
		}
		else {
			return false;
		}
	}
	private static long power(int rem, int digitCount) {
		long product = 1;
		for(int i=0; i<digitCount; i++) {
			product = product * rem;
		}
		return product;
	}
	private static int getDigitCount(long num) {
		int n=1;
		while(num / 10 > 0) {
			++n;
			num = num/10;
		}
		return n;
	}
}
