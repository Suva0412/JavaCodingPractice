package com.Suva;

public class genericmethododdeven {

	public void even(int a) {
		if (a%2==0)
			System.out.println("The number is even:" +a);
			else
				System.out.println("The number is odd: "+a);
	}
	public boolean is_even (int a) {
		if (a%2==0)
			return true;
		else
			return false;
	}
	public boolean is_odd (int b) {
		if (b%2!=0)
			return true;
		else
		return false;
	}
	public boolean is_palindrome (String st) {
	String str="";
	 for ( int i= st.length()-1; i >=0; i--) {
		  str= str + st.charAt(i);
	 } 
	 System.out.println("The reversed string is:" +str);
		if (str.equals(st))
			return true;
		else
			return false;
	}
}