package TalentPace;

import java.util.Scanner;

public class ReverseEachWord {
public static void main(String[] args) {
String s="ram is good";
Scanner sc=new Scanner(s);
sc.useDelimiter(" ");
String res="";
while(sc.hasNext()) {
	String temp=sc.next();
	res+=ram(temp)+" ";
	
}
System.out.println(res);

}

private static String ram(String s) {
	// TODO Auto-gen
	Scanner sc1=new Scanner(s);
	sc1.useDelimiter("");
	String res1="";
	while(sc1.hasNext()) {
		String temp1=sc1.next();
		res1=temp1+res1;
		
	}
	return res1;
}
}
