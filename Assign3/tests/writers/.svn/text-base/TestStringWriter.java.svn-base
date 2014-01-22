package writers;

public class TestStringWriter extends TestWriter {

	private StringWriter _stringWriter;
	
	public Writer createWriter(){
		_stringWriter = new StringWriter();
		return _stringWriter;
	}
	
	public String getWrittenContent() throws Exception {
		return _stringWriter.getContent();
	}
}
