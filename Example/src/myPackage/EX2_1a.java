package myPackage;

import java.util.Scanner;

public class EX2_1a {

	//Read a four-digit integer, such as 2016
	//4자리 정수 한번에 받기(항상4자리라고 가정)
	//Display one digit per line, e.g., 2, 0, 1, and 6 in each line
	//한 줄에 한 자씩 출력하기

	
	public static void main(String[] args) {
	

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a four-digit integer: ");
		int num = scanner.nextInt();
		
		System.out.println(num/1000);
		num=num%1000;
		System.out.println(num/100);
		num=num%100;
		System.out.println(num/10);
		num=num%10;
		System.out.println(num);
		
	}

}
