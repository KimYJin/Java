package myPackage;

import java.util.Scanner;

/* Read the number n of scores (integers) from keyboard
Read n scores (store in an array of length n)
Print the average of the scores
Print all scores above the average
*/

public class Ex7_1a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int scores[] = new int[n];
		
		int sum=0;
		double average=0.0;
		
		for(int i=0;i<scores.length;i++){
			scores[i]=scanner.nextInt();
			sum += scores[i];
		}
		
		average = sum / scores.length;
		System.out.println("average: "+average);
		
		for(int score : scores)
		{
			if(score > average)
				System.out.println(score);
		}

	}

}
