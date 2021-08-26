//Import the Scanner class of the java util package 
import java.util.Scanner;

public class GuessTheNumberGame {

	/* Name: Aishwarya Narayanan
	 * Date: May 28, 2021
	 * Purpose: To randomly generate a number from 1 to 10 and make the user guess what the number is */
	
	public static void main(String[] args) {
	
		//Declaring and instantiating the object 
		Scanner input = new Scanner(System.in);
		
		//Introduction
		System.out.println("Welcome To The Guess The Number Game!");
		System.out.println("************************************** \n");
		
		//Round 1
		System.out.println("Round 1");
		
		//Set a range of 1 to 10 for the random number
		int minNum = 1;
		int maxNum = 10;
				
		//Generate a random number between 1 to 10 
		int ranNum = (int)(Math.random()*(maxNum-minNum+1)+minNum);
		
		//Make the user guess the number 
		System.out.println("Guess a number from 1 to 10");
		int guessNum = input.nextInt();
		
		//Declare a variable to keep track of the user's score
		int score = 0;
		
		//Check if the user's guess is within the 1 to 10 range
		//Tell the user if their guess was too high, too low, or correct.
	    //If the user's guess was incorrect, show them the correct number. If the user's guess was correct, add 50 points to their score.   
		if (guessNum < minNum || guessNum > maxNum) {
			System.out.println("Your guess is out of the range.");
		}
		else if (guessNum > ranNum) {
			System.out.println("Your guess is too high! The number was " + ranNum);
		}
		else if (guessNum < ranNum) {
			System.out.println("Your guess is too low! The number was " + ranNum);
		}
		else {
			score += 50;
			System.out.println("Congratulations! You guessed the correct number!");
		}	
		
		
		//Round 2
		System.out.println("");
		System.out.println("Now it's time for Round 2!");
			
		//Generate a random number between 1 to 10 
		int ranNumTwo = (int)(Math.random()*(maxNum-minNum+1)+minNum);
			
		//Make the user guess the number 
		System.out.println("Guess a number from 1 to 10");
		int guessNumTwo = input.nextInt();
			
		//Check if the user's guess is within the 1 to 10 range
		//Tell the user if their guess was too high, too low, or correct.
	    //If the user's guess was incorrect, show them the correct number. If the user's guess was correct, add 50 points to their score.
		if (guessNumTwo < minNum || guessNumTwo > maxNum) {
			System.out.println("Your guess is out of the range.");
		}
		else if (guessNumTwo > ranNumTwo) {
			System.out.println("Your guess is too high! The number was " + ranNumTwo);
		}
		else if (guessNumTwo < ranNumTwo) {
			System.out.println("Your guess is too low! The number was " + ranNumTwo);
			}
		else {
			score += 50;
			System.out.println("Congratulations! You guessed the correct number!");
		}	

		
		//Round 3
		System.out.println("");
		System.out.println("Now it's time for Round 3! This is the last round!");
			
		//Generate a random number between 1 to 10 
		int ranNumThree = (int)(Math.random()*(maxNum-minNum+1)+minNum);
				
		//Make the user guess the number 
		System.out.println("Guess a number from 1 to 10");
		int guessNumThree = input.nextInt();
			
		//Check if the user's guess is within the 1 to 10 range
		//Tell the user if their guess was too high, too low, or correct.
	    //If the user's guess was incorrect, show them the correct number. If the user's guess was correct, add 50 points to their score.
		if (guessNumThree < minNum || guessNumThree > maxNum) {
			System.out.println("Your guess is out of the range.");
		}
		else if (guessNumThree > ranNumThree) {
			System.out.println("Your guess is too high! The number was " + ranNumThree);
		}
		else if (guessNumThree < ranNumThree) {
			System.out.println("Your guess is too low! The number was " + ranNumThree);
		}
		else {
			score += 50;
			System.out.println("Congratulations! You guessed the correct number!");
		}
			
		//Show the user their total score
		System.out.println("");
		System.out.println("Your total score is..." + score);
		System.out.println("Hope you enjoyed playing this game!");
			
		
		//Close the input
		input.close();
				
		
	}//main

}//GuessTheNumberGame
