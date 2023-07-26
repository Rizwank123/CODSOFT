package come.codsoft;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		InputFileHandler inputfile=new InputFileHandler();
		InputStringHandler inputStringHandler=new InputStringHandler();
		StringToArrayCovertor strToArray=new StringToArrayCovertor();
		String s = "*****************************" +
                "*   1. User Input String      " +
                "*   2. File Input             " +
                "*   0. Exit                   " +
                "*****************************";
		Map<String,Integer>wordFrequency=new HashMap<>();
		while(true) {
			System.out.println(s);
			System.out.println("Enter you choice: ");
			int choice=sc.nextInt();
			if(choice==0) break;
			if(choice==1) {
				String str=inputStringHandler.UserInput();
			String[] arr=	strToArray.convertToArray(str);
			int c=0;
			for(int i=0;i<arr.length;i++) {
				String w=arr[i].toLowerCase();
				wordFrequency.put(w,wordFrequency.getOrDefault(w, 0)+1);
				if(strToArray.stopWords.contains(arr[i])) continue;
				else c++;
			}
			for(String key:wordFrequency.keySet()) {
				System.out.println("word: "+key+"    "+" frquency: "+wordFrequency.get(key));
			}
			System.out.println("total words count is : "+c);
				
				
			}
			else if(choice==2) {
				String str=inputfile.userFileReader();
				
				String[] arr=	strToArray.convertToArray(str);
				int c=0;
				for(int i=0;i<arr.length;i++) {
					String w=arr[i].toLowerCase();
					wordFrequency.put(w,wordFrequency.getOrDefault(w, 0)+1);
					if(strToArray.stopWords.contains(arr[i])) continue;
					else c++;
				}
				for(String key:wordFrequency.keySet()) {
					System.out.println("word: "+key+"    "+" frquency: "+wordFrequency.get(key));
				}
				System.out.println("total words count is : "+c);
				
				
			}
			else System.out.println("Invaild Input");
		}
		
	}
	
	

}
