package accenture;

public class pa {
public static void main(String[] args) {
String s="raaaaaaaamjkkk";


int fact=1;

for(int j=1;j<=count1(s);j++) {
	fact*=j;
}
	System.out.println(fact);


}

private static int count1(String  s) {
	// TOString vowels="AEIOUaeiou";DO Auto-generated method stub
	String vowels="AEIOUaeiou";
	int count=0;
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		if(!vowels.contains(c+"")) {
			count++;
		}
		//return count;
	}
	return count;

}
}
