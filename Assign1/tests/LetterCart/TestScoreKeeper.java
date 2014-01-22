
package LetterCart;
import junit.framework.TestCase;



public class TestScoreKeeper extends TestCase {
	ScoreKeeper _score;
	
	public void setUp(){
		_score = new ScoreKeeper();
	}
	
	public void testScoreKeeperInitilization(){
		assertEquals(0, _score.getTotalScore());
	}
	
	public void testAddPoints(){
		_score.addPoints("AND");
		assertEquals(19,_score.getTotalScore());
	}
	
	public void testAddPointsPalindrome(){
		_score.addPoints("MOM");
		assertEquals(91,_score.getTotalScore());
	}
	
	public void testSubtractPointsCartDiscard(){
		_score.subtractPointsForWord("ADE");
		assertEquals(-20, _score.getTotalScore());
	}
	
	public void testSubtractPointsShelfLetterDiscard(){
		_score.subtractPointsForLetter('K');
		assertEquals(-11, _score.getTotalScore());
	}
	
	public void testIsWordPalindrome(){
		assertTrue(_score.isWordPalindrome("CIVIC"));
	}
	
	public void testIsWordPalindromeNotAPalindomre(){
		assertFalse(_score.isWordPalindrome("BAT"));
	}
	
	public void testIsPalindromeNotAWord(){
		assertFalse(_score.isWordPalindrome("ABA"));
	}
}