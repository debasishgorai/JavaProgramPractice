package StringArrayPractice;

public class ReverseEachWord {
public static void main(String[] args) {

	String s= "java is  easy";
	char[]a=s.toCharArray();
	String s1=" ";
	int i=0;
	
	int j=0;
	while(i<a.length) {
		while(j<a.length && a[j]!=' ')
			j--;
		
		int k=i-1;
		String t="";
		while(k>=i) {
			
			t+=a[k];
			k--;
				
		}
		s1+=t;
		
	}
	System.out.println(s1);

}
}
