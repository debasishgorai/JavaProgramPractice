package codingQuestion;

public class StringPalindrome {
	
	    public static void main(String[] args) {
	        String str = "madam"; // You can change this to test different strings
	        if (isPalindrome(str)) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }
	    }

	    // Function to check if a string is a palindrome
	    public static boolean isPalindrome(String str) {
	        // Convert the string to lower case to make the comparison case-insensitive
	        str = str.toLowerCase();

	        // Compare characters from both ends of the string
	        int start = 0;
	        int end = str.length() - 1;
	        
	        while (start < end) {
	            if (str.charAt(start) != str.charAt(end)) {
	                return false; // If characters don't match, it's not a palindrome
	            }
	            start++;
	            end--;
	        }
	        return true; // If no mismatch is found, it's a palindrome
	    }
	

}
