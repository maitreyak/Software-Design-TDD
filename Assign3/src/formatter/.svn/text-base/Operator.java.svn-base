package formatter;


public abstract class Operator implements Formatter {

	private Formatter formatter;
	
	public Operator(Formatter _formatter){
		formatter = _formatter;
	}
	
	public void writeToTarget(String stringToFormat) throws Exception{
		formatter.writeToTarget(getOperatedString(stringToFormat));
	}

	public abstract String getOperatedString(String stringToFormat);

}
