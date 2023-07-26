package come.codsoft;

import java.util.Scanner;

public class InputStringHandler {
	public String UserInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your text here ");
		String s=sc.nextLine();
		return s;
	}

}
