# DiceyGames
Dice Game Mid-Project( Stella Lin &amp; Nahima Abea)
package midCourseProject;

public class DiceGame {
	
	static Boolean keepRolling = true;

	public static void main(String[] args) {
		int point = 0;
		point = rollDice();
		System.out.println(firstTry(point));
		int sum = 0;
		while (keepRolling) {
			sum=rollDice();
			System.out.println(continueRolling(point,sum));
		}
	}
	
	public static int rollDie() {
		return 1 + (int)(Math.random() * 6);
	}
	
	public static int rollDice() {
		int die1 = rollDie();
		int die2 = rollDie();
		int sum = die1 + die2;
		System.out.println("You rolled "+sum+".");
		return sum;
		
	}
	
	public static String firstTry(int point) {
		String firstMessage;
		switch(point) {
		case 7:
		case 11: 	
			firstMessage = "You win!";
			keepRolling = false;
			return firstMessage;
		case 2:
		case 3:
		case 12:
			firstMessage = "You lose!";
			keepRolling = false;
			return firstMessage;
		default:
			firstMessage = "POINT is "+point+".";
			return firstMessage;
		}
	}

	public static String continueRolling(int point, int sum) {
		String message;
		if (sum == point) {	
			message = "You win!";
			keepRolling = false;
			return message;
		} else if (sum == 7){
			message = "You lose!";
			keepRolling = false;
			return message;
		}
		else {
			message = "POINT is "+point+".";
			return message;
		}
	}
	
}
