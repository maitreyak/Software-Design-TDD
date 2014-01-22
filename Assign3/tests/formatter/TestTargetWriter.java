package formatter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import writers.FileWriter;
import writers.Writer;
import junit.framework.TestCase;

public class TestTargetWriter extends TestCase{
	
private Writer _writer ;
private Formatter _formatter;
private Formatter decorator;
	
public void setUp() throws IOException{
	_writer = new FileWriter("test.txt");
	_formatter = new TargetWriter(_writer);	
}
	
public void testFormatterToLowerToUpper() throws Exception{
    decorator = new ToLower(new ToUpper(_formatter));	
    decorator.writeToTarget("maitreya");
    assertEquals("MAITREYA", getWrittenContent()); 
}

public void testFormatterToUpperToLower() throws Exception{
	decorator = new ToUpper(new ToLower(_formatter));	
	decorator.writeToTarget("Maitreya");
	assertEquals("maitreya", getWrittenContent()); 
}

public void testFormatterToUpperStupidRemover() throws Exception{
	decorator = new ToUpper(new ReplaceStupid(_formatter));	
	decorator.writeToTarget("This is stupid");
	assertEquals("THIS IS STUPID", getWrittenContent()); 
}

public void testFormatterToLowerStupidReplace() throws Exception{
	decorator = new ToLower(new ReplaceStupid(_formatter));	
	decorator.writeToTarget("This is stupid");
    assertEquals("this is s*****", getWrittenContent()); 
}

public void testFormatterDuplicateRemoverStupidReplacer() throws Exception{
	decorator = new DuplicateRemover(new ReplaceStupid(_formatter));	
	decorator.writeToTarget("This is stupid stupid stupid is is really really");
	assertEquals("This is s***** is really", getWrittenContent()); 
}

public void testFormatterOnlyForCurrentInput() throws Exception{
	decorator = new ToLower(new ToUpper(_formatter));	
	decorator.writeToTarget("appear in upper case");
	decorator = new ToUpper(new ToLower(_formatter)); 	
	decorator.writeToTarget("APPEAR IN LOWER CASE");
	assertEquals("APPEAR IN UPPER CASEappear in lower case", getWrittenContent());  
}

private String getWrittenContent() throws IOException{
	String line = "";
	FileReader fileReader = new FileReader("test.txt");
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	try{
		if((line = bufferedReader.readLine()) == null)	
			return "";
	}
	finally{
		bufferedReader.close();
		fileReader.close();
	}
	return line;
}	


}