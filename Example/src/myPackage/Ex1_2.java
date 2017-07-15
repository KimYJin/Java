package myPackage;

import java.util.Scanner;

public class Ex1_2 {

	//Read two integers and display the number of integers between them, 
	//including themselves
	//E.g., print 4 for given two integers 3 and 6

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("num1: ");
		
		int num1 = scanner.nextInt();
		
		System.out.print("num2: ");
		
		int num2= scanner.nextInt();
		
		int result;
		
		if(num2>=num1)
			result = (num2-num1) + 1;
		else
			result = (num1-num2) + 1;
		
		System.out.println("result: "+result);
	}



}
