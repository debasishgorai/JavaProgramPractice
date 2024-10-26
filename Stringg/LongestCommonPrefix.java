package Stringg;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // System.out.println(LongestCommonPrefix("dog","racecar","car"));
  
  
	}

	private static String  LongestCommonPrefix(String[]strs) {
		// TODO Auto-generated method stub
//		   String prefix = strs[0];
//	        for(int index=1;index<strs.length;index++){
//	            while(strs[index].indexOf(prefix) != 0){
//	                prefix=prefix.substring(0,prefix.length()-1);
//	            }
//	        }
//	        return prefix;
//	    }
//	
	    Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
	

}
