package Aiub.Lab2;

import java.util.Scanner;

public class P2Tax {
	  public static void main(String[]args) {
	        double amount, tax;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter money");
			amount = in.nextInt();
		
			tax = amount*.15;
			
			System.out.println("Tax is : " + tax);
	    }
}
