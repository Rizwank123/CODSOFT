package come.codsoft;

import java.util.HashSet;
import java.util.Set;

public class StringToArrayCovertor {
	
	Set<String> stopWords = new HashSet<>();
     
	
	public String[] convertToArray(String s) {
		
		stopWords.add("the");
	     stopWords.add("is");
	     stopWords.add("and");
	     stopWords.add("a");
	     stopWords.add("an");
	     stopWords.add("in");
	     stopWords.add("on");
	     stopWords.add("of");
	     stopWords.add("to");
	     stopWords.add("it");
	     stopWords.add("for");
	     stopWords.add("with");
	     stopWords.add("as");
		
		 String regex = "[\\s\\p{Punct}]+";
		return s.split(regex);
	}

}
