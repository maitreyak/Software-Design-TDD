package detectors;

import detectors.PalindromeDetector;
import junit.framework.TestCase;

public class TestPalindromeDetector extends TestCase{

  PalindromeDetector detector;
	
  public void setUp(){
  	detector = new PalindromeDetector();
  }
  public void testIsPalindromeTrue(){
	  assertTrue(detector.isPalindrome("aba"));
  }
  
  public void testIsPalindromeMixedCase(){
	  assertTrue(detector.isPalindrome("ABa"));
  }
  
  public void testIsPalindromeFalse(){
	  assertFalse(detector.isPalindrome("rat"));
  }
}
