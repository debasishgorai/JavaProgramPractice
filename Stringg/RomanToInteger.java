package Stringg;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(romanToInt("XXIV"));
	}

	private static int romanToInt(String s) {
		// TODO Auto-generated method stub
		   Map<Character, Integer> romanValues = new HashMap<>();
	        romanValues.put('I', 1);
	        romanValues.put('V', 5);
	        romanValues.put('X', 10);
	        romanValues.put('L', 50);
	        romanValues.put('C', 100);
	        romanValues.put('D', 500);
	        romanValues.put('M', 1000);

	        int result = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            int currValue = romanValues.get(s.charAt(i));

	            if (i < s.length() - 1 && currValue < romanValues.get(s.charAt(i + 1))) {
	                result -= currValue;
	            } else {
	                result += currValue;
	            }
	        }

	        return result;
		
				
		
		
		
		
		

	}

}
