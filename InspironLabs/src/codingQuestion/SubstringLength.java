package codingQuestion;

public class SubstringLength {
	
	    public static int maxLengthOfUniqueSubstring(String s) {
	        // Array to store the last index of each character (for ASCII, 128 possible characters)
	        int[] lastIndex = new int[128]; // Assuming ASCII characters
	        int maxLength = 0;
	        int start = 0; // Left pointer of the sliding window
	        
	        for (int end = 0; end < s.length(); end++) {
	            char currentChar = s.charAt(end);
	            
	            // If the character is already in the window, move the start pointer
	            // to the right of the last occurrence of currentChar
	            start = Math.max(start, lastIndex[currentChar]);
	            
	            // Calculate the maximum length of the substring without repeating characters
	            maxLength = Math.max(maxLength, end - start + 1);
	            
	            // Update the last index of the current character
	            lastIndex[currentChar] = end + 1; // store next index to be used for the start pointer
	        }
	        
	        return maxLength;
	    }

	    public static void main(String[] args) {
	        String input = "abcabcbb";
	        int result = maxLengthOfUniqueSubstring(input);
	        System.out.println("The maximum length of a substring without repeating characters is: " + result);
	    }
	

}
