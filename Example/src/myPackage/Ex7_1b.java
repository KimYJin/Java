package myPackage;

import java.util.Scanner;

/*Create an array frequency of size 10 for digits 0 ~ 9
Read a phone number from keyboard
Examine each digit and increment corresponding frequency element
Print all frequency elements
E.g., f[0] = 2, f[1] = 2, ¡¦ for ¡°010-1234-3456¡±
Reset frequency and repeat
*/

public class Ex7_1b {
	
	public static void main(String[] args) {
		
		int []arr = new int[10];
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=0;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a phone number: ");
		String phoneNumber = scanner.nextLine();
		
		for(int i=0; i < phoneNumber.length(); i++)
		{
			char ch = phoneNumber.charAt(i);
			
			if(Character.isDigit(ch))
			{
				int digit=Character.getNumericValue(ch);
				arr[digit]++;
			}
		}
	
		for(int i=0; i < arr.length ;i++)
		{
			System.out.println("f["+i+"] = " + arr[i]);
		}
		

	}
	
	
}
