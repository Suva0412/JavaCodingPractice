package com.Pelatro.Arjun;

import java.util.*;

public class method_practise {

	public void sum2(int a, int b) {
		int c;
		c = a + b;
		System.out.println("The sum is"+c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_practise mp = new method_practise();
		Scanner output = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = output.nextInt();
		System.out.println("Enter the second number:");
		int b = output.nextInt();
		mp.sum2(a, b);

	}
}
