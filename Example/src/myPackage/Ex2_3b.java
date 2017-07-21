package myPackage;

import java.util.Scanner;

public class Ex2_3b {

	public static void main(String[] args) {
		
		double d_feet, r_inches, r_feet, v_cubic, v_gallons;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius(in inches):");
		r_inches = keyboard.nextDouble();
		
		System.out.println("Enter the depth(in feet):");
		d_feet = keyboard.nextDouble();
		
		r_feet= r_inches/12;
	
		v_cubic = r_feet * r_feet * d_feet * 3.1415;
		
		v_gallons = v_cubic * (7.48);
		
		System.out.println(v_gallons);
		System.out.println();
		
		System.out.println("a "+d_feet+ "-foot well with a radius of "+r_inches+" inches holds about "+v_gallons+"gallons of water");

	}

}
