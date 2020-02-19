package Aiub.Lab2;

import java.util.Scanner;

public class P1Rectangle {
	public static void main(String[]args) {
		int length, width, area, perimeter;

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter length of Rectangle");
		length = s1.nextInt();
		System.out.println("Enter width of Rectangle");
		width = s1.nextInt();
		area = length * width;	
		perimeter = 2 * (length + width);
		System.out.println("Area of Rectangle : " + area);
		System.out.println("Rectangle of Rectangle : " + perimeter);
	}
}
