package user;

import junit.framework.TestCase;

public class TestSpecialWordDetector extends TestCase{

	SpecialWordDetector _specialWordDetector;
	
	void setUpSWD(String packageLocation) throws Exception{
		LoadDetectors.getLoadDectectorInstance().setPackageLocation(packageLocation);
		_specialWordDetector = new SpecialWordDetector();
	}
	
	public void testSWDNoLogicPresent() throws Exception{
		setUpSWD("tests/TestDetectors/emptyDetectors");
		assertFalse(_specialWordDetector.isSpecialWord("Madam"));
	}
	
	public void testSWDOnlyPalindrome() throws Exception{
		setUpSWD("tests/TestDetectors/palindromeDetector");
		assertTrue(_specialWordDetector.isSpecialWord("Madam"));
	}
	
	public void testSWDNonPalindrome() throws Exception{
		setUpSWD("tests/TestDetectors/palindromeDetector");		
		assertFalse(_specialWordDetector.isSpecialWord("Maasm"));
	}
	
	public void testSWDOnlyAlphabetical() throws Exception{
		setUpSWD("tests/TestDetectors/alphabeticalDetector");
		assertTrue(_specialWordDetector.isSpecialWord("almost"));
	}
	
	public void testSWDNonAlphabetical() throws Exception{
		setUpSWD("tests/TestDetectors/alphabeticalDetector");
		assertFalse(_specialWordDetector.isSpecialWord("almostnot"));
	}
	
	public void testSWDAllAvailableDetector() throws Exception{
		setUpSWD("tests/TestDetectors/allDetectors");
		assertTrue(_specialWordDetector.isSpecialWord("almost"));
		assertTrue(_specialWordDetector.isSpecialWord("mom"));
	}
	
	public void testSWDDetectorRemoved() throws Exception{
		setUpSWD("tests/TestDetectors/alphabeticalDetector");
		LoadDetectors.getLoadDectectorInstance().clearDetectorList();
		assertTrue(_specialWordDetector.isSpecialWord("almost"));
	}

	public void tearDown(){
		LoadDetectors.getLoadDectectorInstance().setPackageLocation("Detectors");
	}
}
