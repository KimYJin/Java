package myPackage;

import java.util.Scanner;

public class Ex2_1b {

	public static void main(String[] args) {
		//Read a temperature in Fahrenheit
		//È­¾¾ ¿Âµµ¸¦ ¹Þ°í
		//Compute a temperature in Celsius and print it
		//C = 5 (F - 32) / 9 ¼·¾¾¿Âµµ·Î ¹Ù²ã Ãâ·Â

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a temperature in Fahrenheit: ");
		float f = scanner.nextFloat();
		
		float c = (5*(f-32))/9;
		
		System.out.print("Temperature computed in Celsius: ");
		System.out.print(c);
		
	}

}
