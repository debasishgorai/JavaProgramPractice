package StringArrayPractice;

public class mostoccurence {
public static void main(String[] args) {
	String s="rammhhhhh";
	char d='\u0000';

	int max=0;
	
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		String s1=s.replace(c+"","");
		int count=s.length()-s1.length();
		if(count>max) {
			max=count;
			d=c;
		}
	}
	System.out.println(d+"   "+max);
}
}
