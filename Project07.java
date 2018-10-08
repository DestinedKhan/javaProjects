/*
 * Project07.java
 * 
 *   A program that plays the dice game high/low
 *   Used to practice breaking code up into methods. 
 * 
 * @author Liam Thacker
 * @date 10/7/18
 * 
 */
package osu.cse1223;
import java.util.Scanner;


public class Project07 {


	public static void main(String[] args) {
		Scanner inScanner =  new Scanner(System.in);
		boolean running=true;
		int currentPool = 100;
		while(running) {
		int bet = getBet(inScanner, currentPool);
		if(bet<=0) {
			running=false;
		}
		char highLow = getHighLow(inScanner);
		int die1 = getRoll();
		int die2 = getRoll();
		System.out.println("Die 1  rolls: "+die1);
		System.out.println("Die 2  rolls: "+die2);
		int roll = die1+die2;
		System.out.println("Total of the two dice is ");
		}
	}
	
	
	// Given a Scanner and a current maximum amount of money, prompt the user for
	// an integer representing the number of dollars that they want to bet.  This
	// number must be between 0 and to maximum number of dollars.  If the user enters
	// a number that is out of bounds, display an error message and ask again.
	// Return the bet to the calling program.
	private static int getBet(Scanner inScanner, int currentPool) {
		boolean running = true; 
		int getBet = 0;
		System.out.println("You have "+currentPool+" dollars.");
		System.out.print("Enter an amount to bet (0 to quit): ");
		
		while(running) {
		int bet=inScanner.nextInt();
			if(bet==0) {
				System.out.println("You have "+currentPool+ " dollars left.");
				System.out.println("Goodbye!");
				running = !running;
			}
			else if (bet<currentPool && bet > 0) {
				getBet=bet;
				running = !running;
				
			}
			else {
				System.out.println("Your bet MUST be between 0 and "+currentPool+" dollars.");
				
			}
		}
		return getBet;
		
	}
	
	// Given a Scanner, prompt the user for a single character indicating whether they
	// would like to bet High ('H'), Low ('L') or Sevens ('S').  Your code should accept
	// either capital or lowercase answers, but should display an error if the user attempts
	// to enter anything but one of these 3 values and prompt for a valid answer.
	// Return the character to the calling program.
	private static char getHighLow(Scanner inScanner) {
		System.out.println("High, low, or sevens (H/L/S): ");
		String choice = inScanner.next();
		char highLow = 0; 
		boolean running=true; 
		while(running) {
		if(choice.equals("s") || choice.equals("S")) {
			highLow='s';
			running = !running;
		}
		else if(choice.equals("h") || choice.equals("H")) {
			highLow='h';
			running = !running;
		}
		else if(choice.equals("l") || choice.equals("L")) {
			highLow='l';
			running = !running;
		}
		else {
			System.out.println("You MUST choose high, low, or sevens.");
		}
		}
		return highLow;
	}
	
	// Produce a random roll of a single six-sided die and return that value to the calling
	// program
	private static int getRoll() {
		int roll = (int )(Math.random()*6-1);
		return roll;
		
		
		// Fill in the body
	}
	
	// Given the choice of high, low or sevens, the player's bet and the total result of
	// the roll of the dice, determine how much the player has won.  If the player loses
	// the bet then winnings should be negative.  If the player wins, the winnings should
	// be equal to the bet if the choice is High or Low and 4 times the bet if the choice
	// was Sevens.  Return the winnings to the calling program.
	private static int determineWinnings(char highLow, int bet, int roll) {
		int winnings = 0;
		
		
		
		
		return winnings;
		// Fill in the body
	}

}
