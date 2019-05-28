package midCourseProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceGameTest {
	
	private static final long VALUES_TO_TEST = 1000;
	
	@Test
	void testRollDie() {
		for (int i=0; i < VALUES_TO_TEST; i++) {
        	assertTrue(DiceGame.rollDie()>=1);
        	assertTrue(DiceGame.rollDie()<=6);
        }
	}

	@Test
	void testRollDice() {
		for (int i=0; i < VALUES_TO_TEST; i++) {
        	assertTrue(DiceGame.rollDice()>=2);
        	assertTrue(DiceGame.rollDice()<=12);
        }
	}

	@Test
	void testFirstTry() {
		assertTrue(DiceGame.firstTry(7).equals("You win!"));
		assertTrue(DiceGame.firstTry(11).equals("You win!"));
		assertTrue(DiceGame.firstTry(2).equals("You lose!"));
		assertTrue(DiceGame.firstTry(3).equals("You lose!"));
		assertTrue(DiceGame.firstTry(12).equals("You lose!"));
		assertTrue(DiceGame.firstTry(4).equals("POINT is 4."));
		assertTrue(DiceGame.firstTry(5).equals("POINT is 5."));
		assertTrue(DiceGame.firstTry(6).equals("POINT is 6."));
		assertTrue(DiceGame.firstTry(8).equals("POINT is 8."));
		assertTrue(DiceGame.firstTry(9).equals("POINT is 9."));
		assertTrue(DiceGame.firstTry(10).equals("POINT is 10."));

	}

	@Test
	void testContinueRolling() {
		assertTrue(DiceGame.continueRolling(4, 2).equals("POINT is 4."));
		assertTrue(DiceGame.continueRolling(4, 3).equals("POINT is 4."));
		assertTrue(DiceGame.continueRolling(4, 4).equals("You win!"));
		assertTrue(DiceGame.continueRolling(4, 5).equals("POINT is 4."));
		assertTrue(DiceGame.continueRolling(4, 6).equals("POINT is 4."));
		assertTrue(DiceGame.continueRolling(4, 7).equals("You lose!"));
		assertTrue(DiceGame.continueRolling(4, 8).equals("POINT is 4."));
		assertTrue(DiceGame.continueRolling(4, 9).equals("POINT is 4."));
		assertTrue(DiceGame.continueRolling(4, 10).equals("POINT is 4."));
		assertTrue(DiceGame.continueRolling(4, 11).equals("POINT is 4."));
		assertTrue(DiceGame.continueRolling(4, 12).equals("POINT is 4."));
		assertTrue(DiceGame.continueRolling(5, 2).equals("POINT is 5."));
		assertTrue(DiceGame.continueRolling(5, 3).equals("POINT is 5."));
		assertTrue(DiceGame.continueRolling(5, 4).equals("POINT is 5."));
		assertTrue(DiceGame.continueRolling(5, 5).equals("You win!"));
		assertTrue(DiceGame.continueRolling(5, 6).equals("POINT is 5."));
		assertTrue(DiceGame.continueRolling(5, 7).equals("You lose!"));
		assertTrue(DiceGame.continueRolling(5, 8).equals("POINT is 5."));
		assertTrue(DiceGame.continueRolling(5, 9).equals("POINT is 5."));
		assertTrue(DiceGame.continueRolling(5, 10).equals("POINT is 5."));
		assertTrue(DiceGame.continueRolling(5, 11).equals("POINT is 5."));
		assertTrue(DiceGame.continueRolling(5, 12).equals("POINT is 5."));
		assertTrue(DiceGame.continueRolling(6, 2).equals("POINT is 6."));
		assertTrue(DiceGame.continueRolling(6, 3).equals("POINT is 6."));
		assertTrue(DiceGame.continueRolling(6, 4).equals("POINT is 6."));
		assertTrue(DiceGame.continueRolling(6, 5).equals("POINT is 6."));
		assertTrue(DiceGame.continueRolling(6, 6).equals("You win!"));
		assertTrue(DiceGame.continueRolling(6, 7).equals("You lose!"));
		assertTrue(DiceGame.continueRolling(6, 8).equals("POINT is 6."));
		assertTrue(DiceGame.continueRolling(6, 9).equals("POINT is 6."));
		assertTrue(DiceGame.continueRolling(6, 10).equals("POINT is 6."));
		assertTrue(DiceGame.continueRolling(6, 11).equals("POINT is 6."));
		assertTrue(DiceGame.continueRolling(6, 12).equals("POINT is 6."));
		assertTrue(DiceGame.continueRolling(8, 2).equals("POINT is 8."));
		assertTrue(DiceGame.continueRolling(8, 3).equals("POINT is 8."));
		assertTrue(DiceGame.continueRolling(8, 4).equals("POINT is 8."));
		assertTrue(DiceGame.continueRolling(8, 5).equals("POINT is 8."));
		assertTrue(DiceGame.continueRolling(8, 6).equals("POINT is 8."));
		assertTrue(DiceGame.continueRolling(8, 7).equals("You lose!"));
		assertTrue(DiceGame.continueRolling(8, 8).equals("You win!"));
		assertTrue(DiceGame.continueRolling(8, 9).equals("POINT is 8."));
		assertTrue(DiceGame.continueRolling(8, 10).equals("POINT is 8."));
		assertTrue(DiceGame.continueRolling(8, 11).equals("POINT is 8."));
		assertTrue(DiceGame.continueRolling(8, 12).equals("POINT is 8."));
		assertTrue(DiceGame.continueRolling(9, 2).equals("POINT is 9."));
		assertTrue(DiceGame.continueRolling(9, 3).equals("POINT is 9."));
		assertTrue(DiceGame.continueRolling(9, 4).equals("POINT is 9."));
		assertTrue(DiceGame.continueRolling(9, 5).equals("POINT is 9."));
		assertTrue(DiceGame.continueRolling(9, 6).equals("POINT is 9."));
		assertTrue(DiceGame.continueRolling(9, 7).equals("You lose!"));
		assertTrue(DiceGame.continueRolling(9, 8).equals("POINT is 9."));
		assertTrue(DiceGame.continueRolling(9, 9).equals("You win!"));
		assertTrue(DiceGame.continueRolling(9, 10).equals("POINT is 9."));
		assertTrue(DiceGame.continueRolling(9, 11).equals("POINT is 9."));
		assertTrue(DiceGame.continueRolling(9, 12).equals("POINT is 9."));
		assertTrue(DiceGame.continueRolling(10, 2).equals("POINT is 10."));
		assertTrue(DiceGame.continueRolling(10, 3).equals("POINT is 10."));
		assertTrue(DiceGame.continueRolling(10, 4).equals("POINT is 10."));
		assertTrue(DiceGame.continueRolling(10, 5).equals("POINT is 10."));
		assertTrue(DiceGame.continueRolling(10, 6).equals("POINT is 10."));
		assertTrue(DiceGame.continueRolling(10, 7).equals("You lose!"));
		assertTrue(DiceGame.continueRolling(10, 8).equals("POINT is 10."));
		assertTrue(DiceGame.continueRolling(10, 9).equals("POINT is 10."));
		assertTrue(DiceGame.continueRolling(10, 10).equals("You win!"));
		assertTrue(DiceGame.continueRolling(10, 11).equals("POINT is 10."));
		assertTrue(DiceGame.continueRolling(10, 12).equals("POINT is 10."));
	}

}
