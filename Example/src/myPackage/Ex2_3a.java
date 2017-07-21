package myPackage;

import java.util.Scanner;

//1. Read the price of an item in cents: a multiple of 5 between 25 and 100, 
//i.e., 25, 30, …, 95, or 100

//2. Assume you paid a dollar, and print the number of 
//quarter (25cents), dime (10 cents), and nickel (5 cents) coins for the change

//E.g., for an item of 45 cents, the change is 55 cents, 
//which is given by 2 quarters, 0 dimes, and 1 nickels


public class Ex2_3a {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("물건 가격: ");
		int price = scanner.nextInt();
		
		int change = 100 - price;
		
		int quarter = change / 25;
		change = change % 10;
		
		int dime = change / 10;
		change = change % 10;
		
		int nickel = change / 5;
		change = change % 5;
		
		System.out.println("거스름 돈 : "+ quarter+" quarters,"+ dime+" dimes,"+ nickel+" nickels." );
		
		
	}

}
