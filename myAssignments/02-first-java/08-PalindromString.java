// 8. To find out whether the given String is Palindrome or not.

package com.learn;
import java.util.Scanner;

public class PalindromString {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String text = input.nextLine();
		String message = text + " is a palindrome string.";
		int length = text.length();
		for(int i=0; i<length/2 - 1; i++) {
			if(text.charAt(i) != text.charAt(length-i-1)) {
				message = text + " is not a palindrome string.";
				break;
			}
		}
		System.out.println(message);
		input.close();
	}
}
