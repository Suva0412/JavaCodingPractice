package com.Suva;

import java.util.*;

public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c = new Calculation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter the operator");
		char ch = sc.next().charAt(0);
		if (ch == '+') {
			c.sum(a, b);
		}
		if (ch == '-') {
			c.diff(a, b);
		}
		if (ch == '*') {
			c.multi(a, b);
		}
		if (ch == '/') {
			c.div(a, b);
		}
	}
}
