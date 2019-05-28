package game;

import java.util.Random;

public class Craps {
	/**
	 * randomNumber - Function should serve as a repeatable function as a roll of a single die
	 * dice - Declares a new Random generator 
	 * die - A random number between 1 & 6 
	 */
	static int rollOne() {
		Random dice = new Random();
		int die = dice.nextInt(6)+1;
		System.out.println(die);
		return die;
	}
	
	/**
	 * adder - Takes in 2 arguments that are int and will return the sum of those 2 numbers
	 */
	static int adder(int a, int b) {
		return a+b;
	}
	
	/**
	 * rollDice - Simulate dice throw and return the sum of the dice 
	 * dice1 & 2 - Call single roll function to get a random value and hold value in varible
	 * rollTotal - Call add function to get sum of this dice throw value
	 */
	static int rollDice() {
		int dice1 = rollOne();
		int dice2 = rollOne();
		int rollTotal = adder(dice1, dice2);
		System.out.println(rollTotal);
		return rollTotal;
	}

	/**
	 * playGame - Simulate a game of craps
	 * firstRoll - Call function to rool dice and hold that value
	 *  
	 */
	static void playGame() {
		int firstRoll = rollDice();
		
		//If the first roll is 7 the user automatically wins
		if(firstRoll == 7) {
			System.out.println("Lucky number 7! You won!");
		}
		//If the first roll is 11 the user automatically wins
		else if(firstRoll == 11) {
			System.out.println("Wow you won on the first roll!");
		}
		//If first roll equals 2 user automatically loses
		else if(firstRoll == 2){
			System.out.println("Aww shucks snake eyes.. You lose.");
		}
		//If first roll equals 2 user automatically loses
		else if(firstRoll == 3){
			System.out.println("A 3 is no good here bucco! You lose.");
		}
		//If first roll equals 2 user automatically loses
		else if(firstRoll == 12){
			System.out.println("Double sixes huh? Well you lose.");
		}
		//If user does not win or lose on first roll
		else {

			//Hold value of firstRoll as point for the rest of game
			int point = firstRoll;
			System.out.println("Point is: " + point);
			
			//Call function to throw dice
			int newRoll = rollDice();
			System.out.println("New roll was: " + newRoll);
			
			//Local variable to control while loop
			boolean hitPoint = false;
			
			//If the new roll value equals the point user wins
			if(newRoll == point) {
				hitPoint = true;	
				System.out.println("Two for the money! You win!");
			} 
			//If the new roll value equals 7 the user loses
			else if(newRoll == 7) {
				hitPoint = true;
				System.out.println("You lose.. 7 must not be that lucky..:(");
			}
			/**
			 * If player does not win or lose on second roll
			 * keep rolling until roll equals point or 7
			 */
			else {
				while(hitPoint == false) {
					int newestRoll = rollDice();
					System.out.println("Newest roll was: " + newestRoll);

					if(newestRoll == point){
						System.out.println("You won!!!!!!");
						hitPoint = true;
					}
					if(newestRoll == 7){
						System.out.println("You lost bucco!");
						hitPoint = true;
					}
				}
			}

		} // End first roll else

	} //End playGame function
	
	//Test function chains and run game here
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame();
		}

}
