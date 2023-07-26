package come.codsoft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputFileHandler {
	
	public String userFileReader() {
		String fileLocation="/Users/macBook/Desktop/CODSOFT/WordCounter/src/demo.txt";
		StringBuilder sb=new StringBuilder();
		try {
			BufferedReader br=new BufferedReader(new FileReader(fileLocation));
			String line;
			while((line=br.readLine())!=null) {
				sb.append(line+" ");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
