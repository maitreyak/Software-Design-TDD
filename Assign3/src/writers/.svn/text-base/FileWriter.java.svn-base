package writers;

import java.io.*;

public class FileWriter implements Writer{

	private BufferedWriter bufferedWriter;
	
	public FileWriter(String fileLocation) throws IOException{
		bufferedWriter = new BufferedWriter(new java.io.FileWriter(fileLocation));
	}

	public void write(String string) throws IOException {
		if(bufferedWriter != null){
			bufferedWriter.write(string);
			bufferedWriter.flush();
		}
	}
	
	public void close() throws IOException{
		bufferedWriter.close();
		bufferedWriter = null;
	}
}
