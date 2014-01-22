package LetterCart;

import junit.framework.TestCase;

public class TestCart extends TestCase{

		Cart _cart;
		
		public void testCanary(){
			assertTrue(true);
		}
		
		public void setUp(){
			_cart = new Cart();
		}
		
		public void testCreateCart(){
			 for(int index = 0;index < 7;index++){
		    	  assertEquals(' ', _cart.getLetterAtIndex(index));
		      }
		}
		
		public void testNumberofCartSlots(){
			assertEquals(7, _cart.getCartString().length());
		}
		
		public void testPlaceAletterInTheCart(){
				_cart.placeALetter('A', 5);
				assertEquals('A',_cart.getLetterAtIndex(5));
		}
		
		public void testPLaceALetterAtIndexIsNotALetter(){
				assertFalse(_cart.placeALetter('8', 4));
		}
		
		public void testPLaceALetterAtIndexIsNotUpperCaseLetter(){
			assertFalse(_cart.placeALetter('b', 4));
		}
		
		public void testPlaceLetterInOccupiedSlot(){
				_cart.placeALetter('B', 5);
				assertFalse(_cart.placeALetter('A', 5));			
		}
		
		public void testCartIsNotEmptyAfterInsertion(){
			_cart.placeALetter('A', 4);
			assertTrue(_cart.getCartString().trim().length() != 0);
		}
		
		public void testGetCartString(){
			_cart.placeALetter('B', 1);
			_cart.placeALetter('A', 2);
			_cart.placeALetter('T', 3);
			assertEquals("BAT",_cart.getCartString().trim());
		}
}
