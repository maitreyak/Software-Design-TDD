package formatter;

import java.util.StringTokenizer;

public class DuplicateRemover extends Operator{

	public DuplicateRemover(Formatter formatter) {
		super(formatter);
	}

	public String getOperatedString(String stringToFormat) {
		return removeContinuousDuplicates(stringToFormat);
	}
	
	private String removeContinuousDuplicates(String stringToFormat){
		StringTokenizer tokens = new StringTokenizer(stringToFormat);
		StringBuffer result = new StringBuffer();
		String current = "";
		String next = "";
		
		while(tokens.hasMoreElements()){
			next = tokens.nextToken();
		    if(!current.equals(next)){
		         result.append(next + " ");
		    current = next;
		    }
		}		
		return result.toString().trim();
	}
}
