package LetterCart;
import junit.framework.TestCase;

public class TestGame extends TestCase{

	Game _game;
	Cart _cart;	
	Shelf _shelf;
	
	public void setUp(){
		_game = new Game();
		_cart = new Cart();
		_shelf = new Shelf();
	}
	
	public void isGameNotNull(){
		assertNotNull(_game);
	}
	
	public void testPassLetterFromShelfToCart(){
		_game.setShelfString("ABTERH");
		_game.passLetterFromShelfToCart(2,5);
		 assertEquals('T', _game.getCartString().charAt(5));
	}
	
	public void testPassLetterFromShelfToCartSelfIndexOutOfBound(){
		try{
			_game.passLetterFromShelfToCart(7, 4);
		}
		catch(StringIndexOutOfBoundsException e){
			
		}
		
	}
	
	public void testPassLetterFromShelfToCartCartIndexOutOfBound(){
		try{
			_game.passLetterFromShelfToCart(4, 8);
		}
		catch(StringIndexOutOfBoundsException e){
			
		}
	}
	
	public void testCollectCart(){
		_game.setShelfString("ABTERH");
		_game.passLetterFromShelfToCart(0,3);
		_game.passLetterFromShelfToCart(4,4);
		_game.passLetterFromShelfToCart(2,5);
		assertTrue(_game.collectCart());		
	}
	
	public void testCollectCartScore(){
		_game.setShelfString("ABTERH");
		_game.passLetterFromShelfToCart(0,3);
		_game.passLetterFromShelfToCart(4,4);
		_game.passLetterFromShelfToCart(2,5);
		_game.collectCart();
		assertEquals(39, _game.getTotalScore());
	}
	
	public void testCollectCartNoDictionaryWord(){
		_game.setShelfString("ABTERH");
		_game.passLetterFromShelfToCart(0,3);
		_game.passLetterFromShelfToCart(2,4);
		_game.passLetterFromShelfToCart(4,5);
		assertFalse(_game.collectCart());
	}
	
	public void testDiscardCartNoAlphabetsInCart(){
		assertFalse(_game.discardCart());		
	}
	
	public void testDiscardCartScore(){
		_game.setShelfString("ABTERH");
		_game.passLetterFromShelfToCart(0,3);
		_game.passLetterFromShelfToCart(2,4);
		_game.passLetterFromShelfToCart(4,5);
		_game.discardCart();
		assertEquals(-49, _game.getTotalScore());
	}
	
	public void testDiscardLetterFromShelf(){
		_game.setShelfString("ABTERH");
		_game.discardLetterFromShelfAtIndex(3);
		assertEquals(-5, _game.getTotalScore());
	}
}