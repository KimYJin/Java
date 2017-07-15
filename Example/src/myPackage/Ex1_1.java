package myPackage;

import java.util.Scanner;

public class Ex1_1 {

	//Read your birth year and print your age
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		int this_year = 2017;
		int birth_year = scanner.nextInt();
		int age = this_year-birth_year+1;
		
		System.out.println(age);
	}

}
