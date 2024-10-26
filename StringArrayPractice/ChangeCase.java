package StringArrayPractice;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ramAsfDDD";
String temp="";
char c2='\u0000';
for(int i=0;i<=s.length()-1;i++) {
	char c=s.charAt(i);
	if(c>='a'&&c<='z') {
		c2=(char) (c-32);
	}
	else if(c>='A'&&c<='Z') {
		c2=(char) (c+32);
	}
	temp+=c2;
}
System.out.println(temp);
	}

}
