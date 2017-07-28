package myPackage;
import java.util.Scanner;
public class SuitDemo {

	public static void main(String[] args) {
		
		Suit cardSuit = Suit.SPADES;
		
		Scanner keyboard = new Scanner(System.in);
		int numScores = keyboard.nextInt();
		int[] scores = new int[numScores];
		for(int num : scores)
		{
			System.out.println(num);
		}
		
		System.out.println(cardSuit.getColor());
		
		System.out.println(cardSuit.ordinal());
		System.out.println(cardSuit.equals(Suit.CLUBS));
		System.out.println(cardSuit.compareTo(Suit.CLUBS));
		System.out.println(cardSuit.compareTo(Suit.HEARTS));
		System.out.println(Suit.valueOf("CLUBS"));

		System.out.println(Suit.valueOf(cardSuit.toString()));
		System.out.println(cardSuit.toString());

	}

}
