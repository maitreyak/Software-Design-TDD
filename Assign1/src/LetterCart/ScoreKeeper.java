package LetterCart;

public class ScoreKeeper {

	private int totalScore;
	
	public ScoreKeeper(){
		totalScore = 0;
	}
	
	public int getTotalScore() {
		return totalScore;
	}

	public void addPoints(String word) {
		if(isWordPalindrome(word))
			totalScore += 50; 
		totalScore = totalScore + getWordValue(word);			
	}

	public void subtractPointsForWord(String word){
		totalScore = totalScore - getWordValue(word) -10;
	}
	
	public void subtractPointsForLetter(char letter){
		String word = "" + letter;
		totalScore = totalScore - getWordValue(word);
	}
	
	public int getWordValue(String word){
		int currScore = 0;
		for(char letter : word.toCharArray()) {
			if(letter==' ')
				continue;
		    currScore += ((int)(letter)) - 64;
		}
		return currScore;
	}
	
	boolean isWordPalindrome(String word){
		if(!Dictionary.getDictionary().isAWord(word))
			return false;
		StringBuffer strWord = new StringBuffer(word);
		return (strWord.reverse().toString()).equals(word);	
	}

}
