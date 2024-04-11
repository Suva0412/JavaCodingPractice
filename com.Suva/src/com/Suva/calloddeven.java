package com.Suva;

import java.util.Scanner;

public class calloddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[100];
		int n, count_odd=0, count_even=0;
		Scanner sc = new Scanner(System.in); 
		
		genericmethododdeven oddeven = new genericmethododdeven();
		
		System.out.println("Enter the array size:");
		n=sc.nextInt();
		
		for (int i=0; i< n; i++)
		{
			System.out.println("Enter the number: ");
			arr[i]=sc.nextInt();
		}
		for (int i=0; i< n ; i++)
		{
		//oddeven.even(arr[i]);
		 if (oddeven.is_even(arr[i])){
			count_even++;
		 }
		 else if (oddeven.is_odd(arr[i])) 
		 {
			 count_odd++;
		 }
		 }
		System.out.println("The even count is: "+count_even);
		System.out.println("The odd count is: "+count_odd);
	}
}
