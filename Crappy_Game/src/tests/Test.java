package tests;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	int adder(int a, int b){
		return a+b;
		}
		@Test
		void test() {
		assertEquals(2, adder(1,1));
		
		//fail("Not yet implemented");
		}
		//////////////////////////////////////////////////
		int randomNumber() {
		Random dice = new Random();
		int myNum = dice.nextInt(6)+1;
		System.out.println(myNum + " random number");
		return myNum;
		}
		@Test
		public void randomNumberTest(){
			int random = randomNumber();
			int high = 6;
			int low = 1;
			assertTrue(high >= random);
			assertTrue(low  <= random);
		}
		/////////////////////////////////////////////////
		private int rollDice() {
			int dice1 = randomNumber();
			int dice2 = randomNumber();
			int rollTotal = adder(dice1, dice2);
			return rollTotal;
		}
		@Test
		public void rollTest(){
			int random = rollDice();
			int high = 12;
			int low = 2;
			assertTrue(high >= random);
			assertTrue(low  <= random);
		}
		//////////////////////////////////////////////////
		@Test
		public void crapOut(){
			int random = rollDice();
			int bad1 = 2;
			int bad2 = 3;
			int bad3 = 12;
			System.out.println("This crapout " + random);
			assertFalse(random == bad1 || random == bad2 || random == bad3);
		}
		
		@Test
		public void crapIn() {
			int random = rollDice();
			int good1 = 7;
			int good2 = 11;
			System.out.println("this crapin " + random);
			assertFalse(random == good1 || random == good2);
		}	
}
