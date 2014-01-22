package LetterCart;
import junit.framework.TestCase;

public class TestShelf extends TestCase{
	
	Shelf _shelf;

	public void setUp(){
		_shelf = new Shelf();
	}
	
	public void testCreateShelf(){
		for(char letter : _shelf.getShelfString().toCharArray())
			assertTrue(Character.isUpperCase(letter));
	}
	
	public void testShelfCapacity(){
		assertEquals(6, _shelf.getShelfString().length());
	}
	
	public void testGetLetterAtIndex(){
		assertTrue(Character.isUpperCase(_shelf.getLetterAtIndex(2)));
	}
	
    public void testGetLetterAtIndexOutOfBounds(){
    	try{
    		_shelf.getLetterAtIndex(22);
    		fail("String index out of bounds exception expected");
    	}
    	catch(StringIndexOutOfBoundsException e){
    	
    	}
    }
    
    public void testShelfLettersRandomness(){
    	boolean isRandom = false;
    	for(int i= 1 ; i< 6; i++){
    		if(_shelf.getLetterAtIndex(0) != _shelf.getLetterAtIndex(i)){
    			isRandom = true;
				break;
    		}
    		assertTrue(isRandom);		
    	}    	
    }
	
	public void testReplaceSingleLetter(){
		char letter = _shelf.getLetterAtIndex(2);
		_shelf.replaceSingleLetter(2);
		assertFalse(letter == _shelf.getLetterAtIndex(2));
	}

	public void testReplaceSingleLetterIndexOutOfBounds(){
		try{
    		_shelf.replaceSingleLetter(8);
    		fail("String index out of bounds exception expected");
    	}
    	catch(StringIndexOutOfBoundsException e){
    	
    	}
	}
	
   public void testGetRandomChar(){
	   assertTrue(Character.isUpperCase(_shelf.getRandomChar()));
   }

   public void testSetShelfString(){
	   _shelf.setShelfString("AHTEBR");
	   assertTrue(_shelf.getShelfString().equals("AHTEBR"));
   }
}
