package Stringg;

import java.util.Scanner;

public class validPalindrome {

	//"A man, a plan, a canal: Panama"
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // Scanner sc = new Scanner(System.in);
 // String s=sc.nextLine();
 // System.out.println(validp("A man, a plan, a canal: Panama"));
  System.out.println(validp("race a car"));
  
	}

	private static boolean validp(String s) {
		// TODO Auto-generated method stub
	
	        if (s.isEmpty()) {
	        	return true;
	        }
	        int start = 0;
	        int last = s.length() - 1;
	        while(start <= last) {
	        	char currFirst = s.charAt(start);
	        	char currLast = s.charAt(last);
	        	if (!Character.isLetterOrDigit(currFirst )) {
	        		start++;
	        	} else if(!Character.isLetterOrDigit(currLast)) {
	        		last--;
	        	} else {
	        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
	        			return false;
	        		}
	        		start++;
	        		last--;
	        	}
	        }
	        return true;
	    }


}
