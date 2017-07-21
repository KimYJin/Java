package myPackage;

import java.util.Scanner;

// Print cashing charge depending on check amount
// If < $10, charge = $1
// Else if < $100, charge = 10 percent
// Else if < $1000, charge = $5 + 5 percent
// Else (กร $1000) charge = $40 + 1 percent


public class Ex3_1a {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the amount: ");
		int money = scanner.nextInt();
		double charge=0;
		
		if(money < 10)
			charge =1;
		else if(money<100 && money >= 10)
			charge = money*0.1;
		else if(money<1000 && money >= 100)
			charge = money*0.05 + 5;
		else
			charge = money*0.01 + 40;
		
		System.out.println("charge: "+charge+"$");
	}

}
