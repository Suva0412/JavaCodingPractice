package com.Suva;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, output;
		char ch;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number");
			a = sc.nextInt();
			System.out.println("Enter the second number");
			b = sc.nextInt();
			output = a + b;
			System.out.println("The output is: " + output);
			System.out.println("Select any choice below: ");
			System.out.println("1) q- quit");
			System.out.println("2) Any other key to continue");
			ch = sc.next().charAt(0);
		} while (ch != 'q'&& ch != 'Q');
	}
}