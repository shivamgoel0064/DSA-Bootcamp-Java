// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.learn;
import java.util.Scanner;

public class OperateOnTwoNumbers {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();
		System.out.print("Enter any operator (+,-,*,/) : ");
		float result = 0;
		String operator = input.next();
		if(operator.equals("+")) {
			result = num1 + num2;
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if(operator.equals("/")) {
			result = num1 / num2;
		}
		else {
			System.out.println("Invalid operator!");
		}
		System.out.println("Result => " + result);
		input.close();
	}
}
