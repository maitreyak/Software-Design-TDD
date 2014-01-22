package LetterCart;

public class Game {

	 private Cart cart;
	 private Shelf shelf;
	 Dictionary dict;
	 ScoreKeeper scoreKeeper;
    	
	 public Game() throws RuntimeException{
		 cart = new Cart();
		 shelf = new Shelf();
		 scoreKeeper = new ScoreKeeper();
		 dict = Dictionary.getDictionary();		 
		 if(dict == null)	
			 throw new RuntimeException("Failed to Load Dictionary; Game Aborted");	     
	 }
	 
	 public boolean passLetterFromShelfToCart(int shelfIndex, int cartIndex)
	 				throws StringIndexOutOfBoundsException{
		 	
		 if(shelfIndex>6 || shelfIndex<0) 
			 throw new StringIndexOutOfBoundsException("Shelf Index is out of bounds. Please select a numebr between 1 to 6.");
		 if(cartIndex>7 || cartIndex<0)
			 throw new StringIndexOutOfBoundsException("Cart Index is out of bounds. Please select a numebr between 1 to 7.");
		 
		 char letter = shelf.getLetterAtIndex(shelfIndex);
		 if (cart.placeALetter(letter, cartIndex))
			 return shelf.replaceSingleLetter(shelfIndex);;
		 return false;
	}
  
	  public boolean collectCart(){
		  String word = cart.getCartString().trim();
		  if(!dict.isAWord(word)){
			  return false;  
		  }
		  scoreKeeper.addPoints(word);
		  cart = new Cart();
		  return true;	  
	 }
	  
	  public int getTotalScore(){
		  return scoreKeeper.getTotalScore();
	  }
	  
	 public boolean discardCart(){	  
		  String word = cart.getCartString().trim();
		  if(word.equals(""))
			  return false;
	 	  scoreKeeper.subtractPointsForWord(word);
	 	  cart = new Cart();
	 	  return true;
	  }
	
	 public boolean discardLetterFromShelfAtIndex(int index)
	 	throws StringIndexOutOfBoundsException{
		 
		 if(index>6 || index<0){
			 throw new StringIndexOutOfBoundsException("Shelf Index is out of bounds. Please select a numebr between 1 to 6.");
		 }
			 char letter = shelf.getLetterAtIndex(index);	 
			 shelf.replaceSingleLetter(index);
			 scoreKeeper.subtractPointsForLetter(letter);
		     return true;
	}
      
	public String getShelfString(){
		return shelf.getShelfString();
	}
	 
	public String getCartString(){
		return cart.getCartString();
	}
	 void setShelfString(String str){
		shelf.setShelfString(str);
	}
	 
}
