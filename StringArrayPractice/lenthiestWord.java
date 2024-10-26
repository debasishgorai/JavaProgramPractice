package StringArrayPractice;

import java.util.Scanner;

public class lenthiestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ram is hhhh     hhhhhhh";
Scanner sc=new Scanner(s);
sc.useDelimiter(" ");
String big="";
int l=0;
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
