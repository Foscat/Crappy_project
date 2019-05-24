package game;

public class Craps {
	static int randomNumber() {
		Random dice = new Random();
		int myNum = dice.nextInt(6)+1;
		System.out.println(myNum);
		return myNum;
		}
	
	static int adder(int a, int b) {
		return a+b;
	}
	
	static int rollDice() {
		int dice1 = randomNumber();
		int dice2 = randomNumber();
		int rollTotal = adder(dice1, dice2);
		System.out.println(rollTotal);
		return rollTotal;
		}
	
	static void playGame() {
		int firstRoll = rollDice();
		
		if(firstRoll == 7) {
			System.out.println("win");
		}
		
		else if(firstRoll == 11) {
			System.out.println("win");
		}
		
		else {
			int point = firstRoll;
			System.out.println("point is " + point);
			
			int newRoll = rollDice();
			System.out.println("new roll was " + newRoll);
			
			boolean hitPoint = false;
			
			if(newRoll == point) {
				hitPoint = true;	
				System.out.println("you win!");
				} 
			else if(newRoll == 7) {
				hitPoint = true;
				System.out.println("You lose");
			}
				
				else {
					while(hitPoint = false) {
						int newestRoll = rollDice();
					}
				}
				
			
					
				
			}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame();
		}

}
