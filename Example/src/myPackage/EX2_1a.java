package myPackage;

import java.util.Scanner;

public class EX2_1a {

	//Read a four-digit integer, such as 2016
	//4�ڸ� ���� �ѹ��� �ޱ�(�׻�4�ڸ���� ����)
	//Display one digit per line, e.g., 2, 0, 1, and 6 in each line
	//�� �ٿ� �� �ھ� ����ϱ�

	
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
