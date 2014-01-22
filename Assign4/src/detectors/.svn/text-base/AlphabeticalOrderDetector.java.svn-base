package detectors;

import java.util.Arrays;

public class AlphabeticalOrderDetector implements Detector{

	public boolean isSpecialWord(String word){
  	return inAlphabeticalOrder(word);
  }
	
	public boolean inAlphabeticalOrder(String word){	
	  char [] wordArray = (word.toLowerCase()).toCharArray();
	  Arrays.sort(wordArray);
	  String sortedString = new String(wordArray);
	  return word.equalsIgnoreCase(sortedString);
  }
}