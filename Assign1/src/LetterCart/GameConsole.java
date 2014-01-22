package LetterCart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class GameConsole {
    private Game game;
    BufferedReader inputRead;
	
 	public void startNewGame(){
 		try{
 			game = new Game(); 
 			inputRead = new BufferedReader(new InputStreamReader(System.in));
        	startUI();
	    }
 		catch(RuntimeException e){
 			System.out.println(e.getMessage());			
	    }
 	    catch(IOException e){
	    	e.printStackTrace();
	    }
	}  
		
	public void displayData(){
		String shelfstring = game.getShelfString();
		String cartstring = game.getCartString();
		int index;
		System.out.print("Shelf: ");
		for(index = 0; index < shelfstring.length(); index++){
			System.out.print("("+ (index + 1) + ")" + shelfstring.charAt(index) + " ");
		}
	    System.out.print("\n Cart: ");
		for(index=0; index<cartstring.length(); index++){
			System.out.print( "(" + (index + 1) + ")" + cartstring.charAt(index) + " ");
		}
    	System.out.println("\n Total Score: " + game.getTotalScore());
	}
	  
	public void printMenu(){
		displayData();
		System.out.println("Menu:");
		System.out.println("1: Add letter from shelf to cart");	
		System.out.println("2: Discard letters from shelf");
		System.out.println("3: Collect cart");
		System.out.println("4: Discard cart");
		System.out.println("5: Quit Game");
		System.out.println("Enter your choice");
	}
	
    public void passLettersFromShelfToCart() throws IOException,NumberFormatException{
		int shelfIndex,cartIndex;
		displayData();
		System.out.println("Enter shelf index and hit return");
		shelfIndex=Integer.parseInt(inputRead.readLine());
		System.out.println("Enter cart index and hit return");
		cartIndex=Integer.parseInt(inputRead.readLine());
		if(!game.passLetterFromShelfToCart(shelfIndex-1, cartIndex-1)){
			System.out.println("Invalid Opeation");
		}
		else{
	    	System.out.println("Done");
	    }
		return;
	}
    
	public void removeShelfLetterAtIndex() throws IOException,NumberFormatException{
		int shelfIndex;
		displayData();	
		System.out.println("Enter shelf index and hit return.");
		shelfIndex=Integer.parseInt(inputRead.readLine());
	    if (!game.discardLetterFromShelfAtIndex(shelfIndex-1)){
		    System.out.println("Invalid Operation");
	    }
	    else{
	    	System.out.println("Done");
	    }
	    return; 	
	}
		
	public void startUI() throws IOException{
		boolean userinputvalid = true;
		String selection="";
        
        
        while(true){
        	
        	if(userinputvalid){
        	    printMenu();
        		selection = inputRead.readLine();
        	}
        	
        	if(selection.equals("1")){
        		try{
        			passLettersFromShelfToCart();	
        		}
        		catch(StringIndexOutOfBoundsException e){
        			userinputvalid=false;
        			System.out.println(e.getMessage());
        		}
        		catch(NumberFormatException e){
        			userinputvalid=false;
        			System.out.println("Not a valid Number.Enter only numbers");
        		}
        		
        	}
        	else if(selection.equals("2")){
        		try{
        		removeShelfLetterAtIndex();
        		}
        		catch(StringIndexOutOfBoundsException e){
        			userinputvalid=false;
        			System.out.println(e.getMessage());
        		}
        		catch(NumberFormatException e){
        			userinputvalid=false;
        			System.out.println("Not a valid Number.Enter only numbers");
        		}
        	}
        	else if(selection.equals("3")){
        	     if(game.collectCart()){
        		    System.out.println("Congrats! Word is found in the dictionary.Score is updated");
        	     }
        	     else{
        	    	 System.out.println("Word not in dictioanry.Too bad."); 
        	     }
        	}
        	else if(selection.equals("4")){
        			if(game.discardCart()){
        				System.out.println("Cart Discarded. Score deducted");
        			}
        			else{
        				System.out.println("Cannot discard cart when its empty."); 
        			}
        	}
        	else if(selection.equals("5")){
        			System.out.println("Quitting game.....Thankyou");
        			break;
        	}
        	
        	
        }
       }
	
	
	public static void main(String[] args) {
        GameConsole gameconsole= new GameConsole();		
        gameconsole.startNewGame();
	} 

}
