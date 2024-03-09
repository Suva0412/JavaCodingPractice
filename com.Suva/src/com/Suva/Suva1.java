package com.Suva;

import java.util.*;

public class Suva1 {
	public static void main(String args[]) {
		int a, b, sum = 0;
		char op;
		// op=first.nex
		Scanner first = new Scanner(System.in);
		// op=first.next().charAt(0);
		System.out.println("Enter first number:");
		a = first.nextInt();

		System.out.println("Enter second number:");
		b = first.nextInt();

		System.out.println("Enter the operator:");
		op = first.next().charAt(0);

		if (op == '+')
			sum = a + b;
		else if (op == '-')
			sum = a - b;
		else if (op == '/') {
			if (b != 0) {
				sum = a / b;
			} else {
				System.out.println("Invalid division using 0");
				return;
			}
		}

		else if (op == '*')
			sum = a * b;
		else
			System.out.println("Invalid operator");

		System.out.println("The output is: " + sum);
	}
}