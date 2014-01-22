package formatter;


public class ToUpper extends Operator{

	public ToUpper(Formatter formatter) {
		super(formatter);
	}
	
	public String getOperatedString(String stringToFormat) {
		return stringToFormat.toUpperCase();
	}
	

}
