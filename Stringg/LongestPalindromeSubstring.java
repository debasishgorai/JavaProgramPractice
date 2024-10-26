package Stringg;

public class LongestPalindromeSubstring {
//	Input: s = "babad"
//			Output: "bab"
//			Explanation: "aba" is also a valid answer.
//			Example 2:
//
//			Input: s = "cbbd"
//			Output: "bb"
//
	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
	}
		 public static String longestPalindrome(String s) {
			int maxLength=1;
			String longest="";
			 
			 for(int i=0;i<=s.length()-1;i++) {
				 for(int j=i+1;j<s.length();j++) {
					    String substring = s.substring(i, j + 1);
		                if (isp(s,i,j) && substring.length() > maxLength) {
		                    longest = substring;
		                    maxLength = substring.length();
		                }
				 }
			 }
			return longest;
				 
		
			 
		    }
		private static boolean isp(String s, int Start, int end) {
			// TODO Auto-generated method stub
			int i=Start;
			int j=end;
			while(i<=j) {
				if(s.charAt(i)!=s.charAt(j)) {
					return false;
					
				
					
				}
				i++;
				j--;
				
			}
		
			
			
			return true;
		}



}
