package formatter;

import writers.StringWriter;
import formatter.DuplicateRemover;
import formatter.Formatter;
import formatter.TargetWriter;
import junit.framework.TestCase;

public class TestDuplicateRemover extends TestCase{
	
	private StringWriter _writer ;
	private DuplicateRemover _duplicateRemover;
		
	public void setUp(){
		_writer = new StringWriter();
		Formatter formatter = new TargetWriter(_writer);
		_duplicateRemover = new DuplicateRemover(formatter);
	}
	
	public void testRemoveDuplicates() throws Exception{
		assertEquals("What is this", _duplicateRemover.getOperatedString("What is is this"));
	}
	
	public void testRemoveDuplicatesNotConsecutive() throws Exception{
		assertEquals("What is this is", _duplicateRemover.getOperatedString("What is this is"));
	}
	
	public void testRemoveDuplicatesMutiple() throws Exception{
		assertEquals("What is this is hello", _duplicateRemover.getOperatedString("What is is is is this is is hello"));
	}
	
	public void testRemoveDuplicatesNoDuplicates() throws Exception{
		assertEquals("What is this", _duplicateRemover.getOperatedString("What is this"));
	}
	
	public void testRemoveDuplicatesEmpty() throws Exception{
		assertEquals("", _duplicateRemover.getOperatedString(""));
	}
	
	public void testWriteToStringWriter() throws Exception{
		_duplicateRemover.writeToTarget("What is is this");
		assertEquals("What is this", _writer.getContent());
	}
}
