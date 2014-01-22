package LetterCart;

import com.swabunga.spell.engine.SpellDictionaryHashMap;
import com.swabunga.spell.event.SpellChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Dictionary {
	
	private SpellDictionaryHashMap dictionary = null;
    private SpellChecker spellChecker = null;
    private static Dictionary dict;
    
    static {
		   try{
			   dict = new Dictionary();
		   }catch(Exception e){
			   dict=null;	
		   }
     
    }
	
    private Dictionary() throws IOException,FileNotFoundException{
            File file =  new File("./resource/english.0");   	
            dictionary = new SpellDictionaryHashMap(file);
            spellChecker = new SpellChecker(dictionary);
    }
        
    public static Dictionary getDictionary() {
		 return dict;
	}
    
    public boolean isAWord(String word) {
		return spellChecker.isCorrect(word);
    }

}


	






