/*
* Assign6Qn8Subash.java
* The Pick 3 lottery drawing.
* @author Subash Malla
* @assignment CSCI 431 Assignment6 - Qn8
* @date 10/10/2016 
*/
package lottery;

import java.util.Random;
import java.util.Scanner;

class lotto {
	private int x1;
	private int x2;
	private int x3;
	private int first;
	private int second;
	private int third;
	private int firstmatchh1;
	private int secondmatch;
	private int thirdmatch;
	private int order1;
	private int order2;
	private int order3;
	private int MatchMatch;
	private int match;

	public lotto() {

		Scanner input = new Scanner(System.in);
		Random random = new Random();
		first = random.nextInt(10);
		second = random.nextInt(10);
		third = random.nextInt(10);

		System.out.println(" Enter a number");
		x1 = input.nextInt();
		System.out.println("Enter another number");
		x2 = input.nextInt();
		System.out.println("Enter another number");
		x3 = input.nextInt();

	}

	public void checkGuesses() {
		if (x1 == first) {
			firstmatchh1 = 1;
		} else if (x1 == second) {
			firstmatchh1 = 2;
		} else if (x1 == third) {
			firstmatchh1 = 3;
		}

		if (x2 == first) {
			secondmatch = 1;
		} else if (x2 == second) {
			secondmatch = 2;
		} else if (x2 == third) {
			secondmatch = 3;
		}
		if (x3 == first) {
			thirdmatch = 1;
		} else if (x3 == second) {
			thirdmatch = 2;
		} else if (x3 == third) {
			thirdmatch = 3;
		}

		if (firstmatchh1 > 0 || secondmatch > 0 || thirdmatch > 0) {
			if (firstmatchh1 == secondmatch || firstmatchh1 == thirdmatch) {
				MatchMatch = 1;
			} else if (firstmatchh1 > 0 && secondmatch > 0 && thirdmatch > 0) {
				MatchMatch = 2;
			} else if (firstmatchh1 > 0 && secondmatch > 0 && thirdmatch > 0) {
				MatchMatch = 3;
			} else {
				MatchMatch = 1;
			}
		}

	}

	public void letscheckexact() {

		if (x1 == first && x2 == second && x3 == third) {
			System.out.println("you have hit the jackpot $1,000,000");
		}

	}

	public void letscheckorder() {

		if (order1 == order2) {
			match--;
		}
		if (order2 == order3) {
			match--;
		}
		if (order1 == order3) {
			match--;
		}

	}

	public void print() {

		System.out.println("The original number was; " + first + second + third);
		System.out.println("Your guess was: " + x1 + x2 + x3);
		System.out.println("You have made a match: " + MatchMatch);

		if (MatchMatch == 0) {
			System.out.println("you won nothing");
		}

		if (MatchMatch == 1) {
			System.out.println("You won $10");

		}
		if (MatchMatch == 2) {
			System.out.println("You won $10000");

		}

	}

}

public class lottery {

	public static void main(String[] args) {
		lotto object = new lotto();

		object.checkGuesses();
		object.letscheckorder();
		object.letscheckexact();
		object.print();

	}
}
