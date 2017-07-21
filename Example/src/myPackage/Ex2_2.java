package myPackage;

import java.util.Scanner;

//Read a line of text
//Move the first word to the end and capitalize the first character, and then print it
//E.g., ¡°Java is the language¡± ¡æ ¡°Is the language Java¡±

public class Ex2_2 {

	public static void main(String[] args) {
		
		System.out.print("Enter a line of text: ");
		
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		int p = line.indexOf(" ");
		
		String first = line.substring(p+1,p+2);
		
		String newLine = first.toUpperCase() + line.substring(p+2) + " "+ line.substring(0,p);
		
		
		System.out.println(newLine);

	}

}
