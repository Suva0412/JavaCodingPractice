package com.Pelatro.Arjun;

import java.util.*;

public class Calcicall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci c = new Calci();
		char ch;
		Scanner output = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = output.nextInt();
		System.out.println("Enter the second number: ");
		int b = output.nextInt();
		System.out.println("Enter the operator: ");
		ch = output.next().charAt(0);
		if (ch == '-') {
			c.diff(a, b);
		}
		if (ch == '+') {
			c.sum(a, b);
		}
		if (ch == '/') {
			c.div(a, b);
		}
		if (ch == '*') {
			c.multi(a, b);
		}
	}
}
