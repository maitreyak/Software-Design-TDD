package writers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileWriter extends TestWriter {
				
	protected Writer createWriter() throws IOException {
			return new FileWriter("test.txt");
	}
	
	public String getWrittenContent() throws IOException{
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
