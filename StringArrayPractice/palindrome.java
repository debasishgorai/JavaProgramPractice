package StringArrayPractice;

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
	String s="A man, a plan, a canal: Panama";

	s=s.toLowerCase();
	s=s.replaceAll(" ", "");
	s=s.replaceAll(",", "");
	s.replaceAll(":", "");
	String rev="";
	Scanner sc=new Scanner(s);
	sc.useDelimiter("");
	while(sc.hasNext()) {
		String s1=sc.next();
		rev=s1+rev;
	}
	if(s.equals(rev)) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
}
}
