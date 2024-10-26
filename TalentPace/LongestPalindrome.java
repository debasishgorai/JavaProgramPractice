package TalentPace;

public class LongestPalindrome {
public static void main(String[] args) {
	String s="malayalam";
	String longk="";
	int max=0;
	for(int i=0;i<=s.length()-1;i++) {
		for(int j=i+1;j<s.length();j++) {
			if(isp(s,i,j)) {
				String k=s.substring(i, j+1);
				if(longk.length()<k.length()) {
				longk=k;
				
				}
			}
			System.out.println(longk);
		}
	
	}
}

private static boolean isp(String s, int start, int end) {
	// TODO Auto-generated method stub
	int i=start;
	int j=end;
	while(i<=j) {
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return false;
}
}
