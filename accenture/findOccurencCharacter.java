package accenture;

public class findOccurencCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="rammkkkkk";
char a='r';
for(int i=0;i<=s.length()-1;i++) {
	char c=s.charAt(i);
	String s1=s.replace(c+"", "");
	int count=s.length()-s1.length();
	
	if(c==a) {
		System.out.println(c+    "     "+count);
		break;
	}
}

	}

}
