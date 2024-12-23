package prgm;

public class SubstringLength {
public static void main(String[] args) {
	System.out.println(sub("ababbcbcbcabcacabccabc"));
}

private static int sub(String s) {
	// TODO Auto-generated method stub
	int max=0;
	int start=0;
	int[] lai=new int[128];
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		
		start=Math.max(start, lai[c]);
		max=Math.max(max, i-start+1);
lai[c]=i+1;
	}
	return max;
}
}
