package lab2;

import java.util.Scanner;

public class PerimeterAndArea {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double length;
		double width;
		double perimeter;
		double area;
		double height;
		double volume;
		boolean answer = true;
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		System.out.println("");
		
		while (answer) {
			System.out.println("Enter Length:");
			length = scnr.nextDouble();
			
			System.out.println("Enter Width:");
			width = scnr.nextDouble();
			
			System.out.println("Enter Height:");
			height = scnr.nextDouble();
			
			area = length * width;
			System.out.println("Area: " + area);
			
			perimeter = (length * 2) + (width * 2);
			System.out.println("Perimeter: " + perimeter);
			
			volume = length * width * height; 
			System.out.println("Volume: " + volume);
			
			System.out.println("");
			
			System.out.println("Continue? (y/n):");
			
			if (scnr.next().startsWith("n")) {
				answer = false;
				}
			}
		
		scnr.close();

	}

}
