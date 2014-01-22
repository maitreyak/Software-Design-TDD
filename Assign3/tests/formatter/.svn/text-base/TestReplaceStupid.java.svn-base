package formatter;

import writers.StringWriter;
import formatter.Formatter;
import formatter.ReplaceStupid;
import formatter.TargetWriter;
import junit.framework.TestCase;

public class TestReplaceStupid extends TestCase{
	
	private StringWriter _writer ;
	ReplaceStupid _stupidReplacer;
		
	public void setUp(){
		_writer = new StringWriter();
		Formatter formatter = new TargetWriter(_writer);
		_stupidReplacer = new ReplaceStupid(formatter);
	}
	
	public void testGetFormattedStringReplaceStupid() throws Exception{
		assertEquals("What is this s*****", _stupidReplacer.getOperatedString("What is this stupid"));
	}
	
	public void testGetFormattedStringUppercaseStupid() throws Exception{
		assertEquals("What is this Stupid", _stupidReplacer.getOperatedString("What is this Stupid"));
	}

	public void testGetFormattedStringNoStupid() throws Exception{
		assertEquals("What is this", _stupidReplacer.getOperatedString("What is this"));
	}
	
	public void testWriteToStringWriter() throws Exception{
		_stupidReplacer.writeToTarget("What is this stupid");
		assertEquals("What is this s*****", _writer.getContent());
	}
}
