package LetterCart;

import junit.framework.TestCase;

public class TestDictionary extends TestCase{
   
	public void testCreateDictionary(){
		assertNotNull(Dictionary.getDictionary());
	}

	public void testDictionaryObjectIsStatic(){
		Dictionary firstDict = Dictionary.getDictionary();
		Dictionary secondDict = Dictionary.getDictionary();
		assertEquals(firstDict.hashCode(), secondDict.hashCode());
	}
	
	public void testIsAWord(){
    	assertTrue(Dictionary.getDictionary().isAWord("FACT"));
    }
    
    public void testIsNotAWord(){
    	assertFalse(Dictionary.getDictionary().isAWord("FATR"));
    }
    
    public void testIsAWordMixedCaseLetters(){
    	assertTrue(Dictionary.getDictionary().isAWord("FaCt"));
    }
    

}
