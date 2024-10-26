package Stringg;
import java.util.*; 
import java.io.*;

//
//Input: "fun&!! time"
//Output: time
//Input: "I love dogs"
//Output: love


public class LongestWord {
	 public static String LongestWord(String sen) {
		    // code goes here  
	     sen = sen.replaceAll("[^a-zA-Z ]", "");
		 String big="";
		 int l=0;
		 Scanner sc= new Scanner(sen);
		 sc.useDelimiter(" ");
		 while(sc.hasNext()) {
			 String temp=sc.next();
			 if(temp.length()>l) {
				 l=temp.length();
				 big=temp;
			 }
			 else if(temp.length()==l){
				 if(temp.compareTo(big)>0) {
					 big=temp;
				 }
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		    return big;
		  }

		  public static void main (String[] args) {  
		    
		    Scanner s = new Scanner(System.in);
		    System.out.print(LongestWord(s.nextLine())); 
		  }

}
