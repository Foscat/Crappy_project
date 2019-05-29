package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

class Test {

	//Write function to add 2 numbers together
	int adder(int a, int b){
		return a+b;
	}
	//Write test to give framework for add function
	@Test
	void test() {
		assertEquals(2, adder(1,1));
	}
	//////////////////////////////////////////////////

	//Write function to return a random number between 1 & 6
	int randomNumber() {
		//Declare a new Random constructor
		Random dice = new Random();
		//Make random be a whole number and between 1 & 6
		int myNum = dice.nextInt(6)+1;
		System.out.println(myNum + " random number");
		return myNum;
	}
	//Write test to ensure random number can only be 1-6
	@Test
	public void randomNumberTest(){
		//Get random number
		int random = randomNumber();
		//Make limiters for acceptable range of values
		int high = 6;
		int low = 1;
		assertTrue(high >= random);
		assertTrue(low  <= random);
	}
	/////////////////////////////////////////////////

	//Write function to simulate dice roll using random number function and add number function
	private int rollDice() {
		//Call random number to get roll value of each die
		int dice1 = randomNumber();
		int dice2 = randomNumber();
		//Call add function to get sum of dice thrown
		int rollTotal = adder(dice1, dice2);
		return rollTotal;
	}
	//Write test to simulate dice roll and check that values can only add up to acceptable range
	@Test
	public void rollTest(){
		//Get dice roll
		int random = rollDice();
		//Make limiters for acceptable range of values
		int high = 12;
		int low = 2;
		assertTrue(high >= random);
		assertTrue(low  <= random);
	}
	//////////////////////////////////////////////////

	//Write test to check if player crapped out on first roll
	@Test
	public void crapOut(){
		//Get dice roll
		int random = rollDice();
		//Make bad values for it to match to
		int bad1 = 2;
		int bad2 = 3;
		int bad3 = 12;
		System.out.println("This crapOut: " + random);
		assertFalse(random == bad1 || random == bad2 || random == bad3);
	}
	///////////////////////////////////////////////////////////////////

	//Write test to check if player won the game in the first round
	@Test
	public void crapIn() {
		//Get dice roll
		int random = rollDice();
		//Make good values it is looking for
		int good1 = 7;
		int good2 = 11;
		System.out.println("This crapIn: " + random);
		assertFalse(random == good1 || random == good2);
	}	
	////////////////////////////////////////////////////////////////////
}
