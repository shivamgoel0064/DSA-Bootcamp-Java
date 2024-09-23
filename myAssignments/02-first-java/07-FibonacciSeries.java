// 7. To calculate Fibonacci Series up to n numbers.

package com.learn;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many number of values of Fibonacci Series you need : ");
		int count = input.nextInt();
		int a=0, b=1, temp;
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		for(int i=0; i<count-2; i++)  {
			temp = a+b;
			a = b;
			b = temp;
			list.add(temp);
		}
		for(Integer n : list) {
			System.out.print(n + " ");
		}
		input.close();
	}
}
