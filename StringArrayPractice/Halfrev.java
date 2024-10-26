package StringArrayPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Halfrev {

	public static void main(String[] args) {
		// TODO Auto-gnerated method stub
String  s="ramis";
String half="";
ArrayList l=new ArrayList();
 Scanner sc=new Scanner(s);
 sc.useDelimiter("");
 while(sc.hasNext()) {
	 l.add(sc.next());
;	 
 }
 for(int i=0;i<=s.length()/2;i++) {
	 half+=l.get(i);
 }
 for(int i=s.length()-1;i>=s.length()/2;i--) {
	 half+=l.get(i);
 }
 System.out.println(half);
	}

}
