package LetterCart;

public class Cart {
	
	private StringBuffer cartString ;	
	
	public Cart(){
		cartString = new StringBuffer("       ");
	}
	
	public char getLetterAtIndex(int index){
		return cartString.charAt(index);
	}
			
	public boolean placeALetter(char letter, int index){
        	if(index<0 || index>7)
        		return false;
           	if(getLetterAtIndex(index) != ' ')
           		return false;
        	if(!Character.isUpperCase(letter))
        		return false;
        	cartString.setCharAt(index, letter);
        	return true;
	}
	
	public String getCartString(){
		return cartString.toString();
	}
}		
	