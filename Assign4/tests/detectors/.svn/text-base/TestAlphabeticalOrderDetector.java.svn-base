package detectors;

import detectors.AlphabeticalOrderDetector;
import junit.framework.TestCase;

public class TestAlphabeticalOrderDetector extends TestCase{

  AlphabeticalOrderDetector detector;
  
  public void setUp(){
	  detector = new AlphabeticalOrderDetector();  
  }
  
  public void testWordInAlphabeticalOrder(){
	  assertTrue(detector.inAlphabeticalOrder("abcxyz"));
  }
  
  public void testWordNotInAlphabeticalOrder(){
	  assertFalse(detector.inAlphabeticalOrder("xyzabc"));
  }
  
  public void testWordInAlphabeticalOrderIgnoresCase(){
	  assertTrue(detector.inAlphabeticalOrder("AbCXyZ"));
  }
}
