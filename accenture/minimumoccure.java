package accenture;

import java.util.HashMap;
import java.util.Map;

public class minimumoccure 

{
	    public static void main(String[] args) {
	        String s = "rrammhhhhh";
	        char minChar = '\u0000';
	        char secondMinChar = '\u0000';
	        int min = Integer.MAX_VALUE;
	        int secondMin = Integer.MAX_VALUE;

	 
	        for (int i = 0; i < s.length(); i++) {
	            char currentChar = s.charAt(i);
	            String s1=s.replace(currentChar+"", "");
	            int count=s.length()-s1.length();
	        
	      
	            if (count < min) {
	                secondMin = min;
	                secondMinChar = minChar;
	                min = count;
	                minChar = currentChar;
	            } else if (count < secondMin && count != min) {
	                secondMin = count;
	                secondMinChar = currentChar;
	            }
	        }

	        System.out.println("Minimum occurrence: " + minChar + " = " + min);
	        System.out.println("Second minimum occurrence: " + secondMinChar + " = " + secondMin);
	    }
	

}
