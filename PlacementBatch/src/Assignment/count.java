package Assignment;

public class count {
public static void main(String[] args) {
	String s="fhhhjkkxkxk";
	String s1="";
	
	while(s.length()>0) {
		char h=s.charAt(0);
	
		int count=s.length()-s1.length();
		s1=s1.replace(h+"", "");
		
		System.out.println(c+" "+count);
		s=s1;
	}

}
}
