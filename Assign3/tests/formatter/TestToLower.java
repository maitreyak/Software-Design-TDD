package formatter;

import writers.StringWriter;
import formatter.Formatter;
import formatter.TargetWriter;
import formatter.ToLower;
import junit.framework.TestCase;

public class TestToLower extends TestCase{
	
	private StringWriter _writer ;
	private ToLower _toLower;
	
	public void setUp(){
		_writer = new StringWriter();
		Formatter formatter = new TargetWriter(_writer);
		_toLower = new ToLower(formatter);
	}
	
	public void testGetOperatedString(){
		assertEquals("rohith", _toLower.getOperatedString("ROhiTh"));
	}
	
	public void testGetOperatedStringAllUpperCase(){
		assertEquals("rohith", _toLower.getOperatedString("ROHITH"));
	}
	
	public void testGetOperatedStringAllLowerCase(){
		assertEquals("rohith", _toLower.getOperatedString("rohith"));
	}

	public void testWriteToStringWriter() throws Exception{
		_toLower.writeToTarget("ROhiTh");
		assertEquals("rohith", _writer.getContent());
	}
}

