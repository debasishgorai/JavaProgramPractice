package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindAlphabet {

	public static void main(String[] args) {
		File f= new File("H:\\Users\\DELL\\Desktop\\myself");
   try {
	   Scanner s=new Scanner(f);
	   while( s.hasNextLine()) {
		  for(char i='a';i<='z';i++) {
			  int count=occur(s.nextLine(),i);
			  System.out.println(i+""+count);
		  }
	   }
	   
   }
   catch(FileNotFoundException e){
	   e.printStackTrace();
   }
	}

	 static int occur(String s, char c) {
		int count=0;
		String s1="";
		
		for(int i=0;i<s.length();i++) {
		
			if(s.charAt(i)==c) {
				 s1=s.replace(c+"", "");
				count=s.length()-s1.length();
			}
		
			}
		return count;
		          
	}

}
