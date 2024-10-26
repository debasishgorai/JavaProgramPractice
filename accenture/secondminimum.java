package accenture;

public class secondminimum {
public static void main(String[] args) {
	String s="ctbttaammm";
	char c1='\u0000';
	int min=Integer.MAX_VALUE;
	
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		String s1=s.replace(c+"", "");
		int count=s.length()-s1.length();
		if(count<=min) {
			min=count;
			c1=c;
		}
	}
	
	System.out.println(c1+"    small    "+min);
}
}
