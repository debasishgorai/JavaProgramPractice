package String;

public class maximumsubstringlength {
public static void main(String[] args) {
	System.out.println(sus("abcdcbac"));
}

private static int sus(String s) {
	// TODO Auto-generated method stub
	int max=0;
	int strt=0;
	int[]last=new int[128];
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		strt=Math.max(strt, last[c]);
			max=Math.max(max, i-strt+1);
			last[c]=i+1;
			
		
	}
	
	
	
	return max;
}
}
