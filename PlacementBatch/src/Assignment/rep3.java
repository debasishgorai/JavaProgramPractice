package Assignment;
import java.util.HashMap;
import java.util.Map;

public class rep3 {


	    public static int sumOfIndices(String input) {
	        // Map to store the count and last index of each character
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Populate the map with character counts and last indices
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);

	            // If character is not present in the map, add it with count 1 and index i
	            if (!charCountMap.containsKey(currentChar)) {
	                charCountMap.put(currentChar, 1);
	            } else {
	                // If character is already present, update the count and index
	                charCountMap.put(currentChar, charCountMap.get(currentChar) + 1);
	            }
	        }

	        int sum = 0;

	        // Iterate through the string to find non-repeating characters with a count of 1
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);

	            if (charCountMap.get(currentChar) == 1 && currentChar == 'i') {
	                sum += i;
	            }
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        String inputString = "agggh";
	        int result = sumOfIndices(inputString);

	        System.out.println("Sum of indices of non-repeating characters with a value of 1: " + result);
	    }
	
}
