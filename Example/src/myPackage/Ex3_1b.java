package myPackage;

import java.util.Scanner;

// Extend Ex2_3a
// Include input checking
// Display an error message, 
// if cost < 25 cents, cost not an integer multiple of 5, or cost > $1(100cents)


public class Ex3_1b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("물건 가격: ");
		int cost = scanner.nextInt();
		
		if(cost<25)
			System.out.println("Error.cost < 25 cents");
		else if(cost % 5 != 0)
			System.out.println("Error.cost not an integer multiple of 5.");
		else if(cost > 100)
			System.out.println("Error.cost > $1(100cents)");
		else
		{
		
			int change = 100 - cost;
		
			int quarter = change / 25;
			change = change % 10;
		
			int dime = change / 10;
			change = change % 10;
		
			int nickel = change / 5;
		
			System.out.println("거스름 돈 : "+ quarter+" quarters,"+ dime+" dimes,"+ nickel+" nickels." );
		}
		
		

	}

}
