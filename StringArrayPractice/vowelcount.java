package StringArrayPractice;

public class vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hhhabclllaaeiouu";
String vowels="AEIOUaeiou";
int vowelsg=0;
int consth=0;
for(int i=0;i<=s.length()-1;i++) {
	char c=s.charAt(i);
	if(vowels.contains(c+"")) {
		vowelsg++;
	}
	else {
		consth ++;
	}
}
System.out.println(vowelsg);
System.out.println(consth);
	}

}
