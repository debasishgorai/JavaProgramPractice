package StringArrayPractice;

import java.util.Scanner;

public class reverseeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="tahh is jjj     hjjoo";
String rev="";
Scanner sc=new Scanner(s);
sc.useDelimiter(" ");
while(sc.hasNext()) {
	String k=sc.next();
	rev+=ram(k)+" ";
	

}
System.out.println(rev);
	}

	private static String ram(String s) {
		// TODO Auto-generated method stub
		String n="";
		Scanner sc1=new Scanner(s);
		sc1.useDelimiter("");
		while(sc1.hasNext()) {
			n=sc1.next()+n;
		}
		
		
		
		
		
		return n;
	}

}
