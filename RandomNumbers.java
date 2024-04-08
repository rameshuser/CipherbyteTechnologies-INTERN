package basic;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

	public static void main(String[] args) {
		int won=0,limit=0;
		Scanner sc=new Scanner(System.in);
		boolean check=true;
		do {
			System.out.println("Enter the Guess Nuber");
			int guess=sc.nextInt();
			int randomNumber=randomNumber();
			if(guess==randomNumber) {
				System.out.println("Congrats You guess The Correct Number"+guess);
				System.out.println("If You Want Contimue This Game (Y/N)");
				String choice=sc.next();
				if(choice.equalsIgnoreCase("N"));{
					check=false;
				}
				won++;
				limit=0;
			}
			else if(guess<randomNumber) {
				System.out.println("Sorry, You Guess The Number Low");
			}
			else {
				System.out.println("Sorry, You Guess The Number High");
			}
			if(limit==5) {
				System.out.println("You Reached The Your Limits");
			}
			limit++;
		}
		while(check&&limit<=5); {
			System.out.println("Total You Won The Game "+won+"Times");
		}
	}

	private static int randomNumber() {
		Random rand=new Random();
		int min=1;
		int max=100;
		return rand.nextInt(max)+1;
	}
}
