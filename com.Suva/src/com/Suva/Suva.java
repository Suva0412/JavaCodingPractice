package com.Suva;

import java.util.Scanner;

public class Suva {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n = sc.nextInt();
		int first = 0, second = 1, sum = 0;
		System.out.print(first);
		System.out.print(" " + second);
		for (int i = 2; i <= n; i++) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(" " + sum);
		}
	}
}