package writers;

public class StringWriter implements Writer{

	private boolean closed;
	private StringBuffer stringBuffer = new StringBuffer();

	public StringWriter(){
		stringBuffer = new StringBuffer();
	}

	public void write(String input) {
		if(!closed)
			stringBuffer.append(input);		
	}
	
	public void close() {
		closed = true;
	}
	
	public String getContent() {
		return stringBuffer.toString();		
	}
}
