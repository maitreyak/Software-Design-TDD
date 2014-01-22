package LetterCart;

public class Shelf {

	StringBuffer shelfSlots = new StringBuffer("      ");
	
	public Shelf(){
      fillShelf();
	}
    
	public void fillShelf(){
		for(int index=0;index<6;index++){
			shelfSlots.setCharAt(index, getRandomChar());
		}
	}
		
    char getRandomChar(){
		int index = (int)(Math.random()*26);
		return (char)( (int)'A' + index );
	}
	
	public boolean replaceSingleLetter(int index) throws StringIndexOutOfBoundsException{
		if(index<0 || index>6){
			throw new StringIndexOutOfBoundsException();	
		}
		shelfSlots.setCharAt(index, getRandomChar());
		return true;
	}
	
	char getLetterAtIndex(int index) throws StringIndexOutOfBoundsException{
		if(index<0 || index>6)
			throw new StringIndexOutOfBoundsException();
		return shelfSlots.charAt(index);
	}
	
	public String getShelfString(){
		return shelfSlots.toString();
	}
	
	void setShelfString(String str){
		shelfSlots.replace(0,6, str);
	}
}
