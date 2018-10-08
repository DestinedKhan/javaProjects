/*
 * Project06
 * This program takes a 16 digit credit card number and ensures its validity
 * 
 * @author Liam Thacker
 * @date 10/3/2018
 * 
 * 
 * 
 */


package osu.cse1223;

import java.util.Scanner;

public class Project06 {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x=1;
		while (x==1) {
		System.out.print("Enter a credit card number (enter a blank line to quit): ");
		String s = in.nextLine();
		
		if(s.isEmpty()) {
			System.out.println("Goodbye!");
			x=0;
		}
		else if(s.length()!=16) {
			System.out.println("ERROR! Number MUST have exactly 16 digits");
			System.out.println();
		}
		else if (s.length()==16) {
		boolean even = true;
		int y = 0;
		int sum = 0;
		int checkDigit = Character.getNumericValue(s.charAt(s.length()-1));
			while(y<s.length()) {
				if(even) {
					
					int num = Character.getNumericValue(s.charAt(y));
					int numDouble = num*2;
						if(numDouble>9) {
							String numberSep = Integer.toString(numDouble);
							int num1 = Character.getNumericValue(numberSep.charAt(0));
							int num2 = Character.getNumericValue(numberSep.charAt(1));
							int num3 = num1 + num2;
							sum = sum+num3;
						}
						else {
							sum=sum+numDouble;
						}
					
					even = false;
					y++;

				}
				if(!even) {
					int num2 = Character.getNumericValue(s.charAt(y));
					even = true;
					y++;
					sum = sum+num2;
				}
			
			}
		sum=sum-checkDigit;
		String sum2 = Integer.toString(sum);
		int sumNum1 = Character.getNumericValue(sum2.charAt(1));
		int calcDigit = 10-sumNum1;
		System.out.println("Check digit should be: "+checkDigit);
		System.out.println("Check digit is: "+calcDigit);
		if(calcDigit==checkDigit) {
			System.out.println("Number is valid");
			System.out.println();
		}
		else {
			System.out.println("Number is not valid");
			System.out.println();
		}
		
		}
		
	}
	}
}
