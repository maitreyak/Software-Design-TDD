package formatter;

import writers.Writer;

public class TargetWriter implements Formatter  {
	
	Writer writer;
	
	public TargetWriter(Writer _writer){
		writer = _writer;
	}
	
	public void writeToTarget(String stringToWrite) throws Exception {
		writer.write(stringToWrite);
	}

}
