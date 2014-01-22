package writers;

import java.io.IOException;

import junit.framework.TestCase;

public abstract class TestWriter extends TestCase{
	
	Writer _writer;
	
	public void testCanary(){
		assertTrue(true);
	}
	
	public void setUp() throws IOException{
		_writer = createWriter();
	}
	
	protected abstract Writer createWriter() throws IOException ;
	
	public void testWrite() throws Exception{
		_writer.write("Rohith");
		assertTrue(verifyContent("Rohith", "test.txt"));
	}
		
	public void testMultipleWrites() throws Exception{
			_writer.write("Rohith");
			_writer.write(" Maitreya");
			assertTrue(verifyContent("Rohith Maitreya", "test.txt"));
	}
	
	public void testWriteAfterClose() throws Exception{
		_writer.write("Rohith");
		_writer.close();
		_writer.write("Maitreya");
		assertTrue(verifyContent("Rohith", "test.txt"));
	}
		
	protected boolean verifyContent(String expectedContent, String fileName) throws Exception{
		return (expectedContent.equals(getWrittenContent()));
	}
	
	public abstract String getWrittenContent() throws Exception; 
	/*
		*/
}
