package StringArrayPractice;

public class numberToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="3a3b3c";
for(int i=0;i<=s.length()-1;i++) {
	char c=s.charAt(i);
	if(c>='0'&&c<='9') {
	int b=c-48;
	while(b>0) {
		System.out.println(s.charAt(i+1));
		b--;
	}
}}
	}

}
