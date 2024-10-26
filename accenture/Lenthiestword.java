package accenture;

import java.util.Scanner;

public class Lenthiestword {
public static void main(String[] args) {
	String s="ramm   tttttttttttttt  is         besttttt";
	int l=0;
	String big="";
	String Second="";
	Scanner sc= new Scanner(s);
	sc.useDelimiter(" ");
	while(sc.hasNext()) {
		String temp=sc.next();
		if(temp.length()>l) {

			l=temp.length();
			big=temp;
		}
		else if(temp.length()==l) {
			if(temp.compareTo(big)>0) {
				big=temp;
		
			}
		}
	}
	System.out.println(big);
}
}
