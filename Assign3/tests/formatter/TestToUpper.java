package formatter;

import writers.StringWriter;
import formatter.Formatter;
import formatter.TargetWriter;
import formatter.ToUpper;
import junit.framework.TestCase;

public class TestToUpper extends TestCase{
	
	private StringWriter _writer ;
	private ToUpper _toUpper;
		
	public void setUp(){
		_writer = new StringWriter();
		Formatter formatter = new TargetWriter(_writer);
		_toUpper = new ToUpper(formatter);
	}
	
	public void testGetOperatedString(){
		assertEquals("ROHITH", _toUpper.getOperatedString("ROhiTh"));
	}
	
	public void testGetOperatedStringAllUpperCase(){
		assertEquals("ROHITH", _toUpper.getOperatedString("ROHITH"));
	}
	
	public void testGetOperatedStringAllLowerCase(){
		assertEquals("ROHITH", _toUpper.getOperatedString("rohith"));
	}
	
	public void testWriteToStringWriter() throws Exception{
		_toUpper.writeToTarget("ROhiTh");
		assertEquals("ROHITH", _writer.getContent());
	}

}
