package accenture;

public class SecondMostOccurence {
public static void main(String[] args) {
	String s="raaafffffffoooooosmmm";
	char c1='\u0000';
	char c2='\u0000';
	int max=0;
	int secmax=0;
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		String s1=s.replace(c+"", "");
		
		int count=s.length()-s1.length();
		if(count>max) {
			c1=c2;
			max=count;
			c1=c;
		}
		else if(count<max & secmax<max) {
			secmax=count;
			c2=c1;
			c2=c;
		}
		
	}
	System.out.println(c1+"  bigg    "+max);
	System.out.println(c2+"   second   "+secmax);
}
}
