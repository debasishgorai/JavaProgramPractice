package StringArrayPractice;

public class changeCase2 {
public static void main(String[] args) {
	String s="rammAffff";
			char c1='\u0000';
	String temp=""
;
	
for(int i=0;i<=s.length()-1;i++) {
	char c=s.charAt(i);
	if(c>='a' && c<='z') {
		c1=(char)(c-32);
	}
	if(c>='A' && c<='Z') {
		c1=(char)(c+32);
	}
	temp+=c1;
}
System.out.println(temp);




}
}
