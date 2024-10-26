package TalentPace;

import java.util.Scanner;

public class ReverseFirstAndLetter {

	
		    public static void main(String[] args) {
		       
		    
		    	        Scanner scanner = new Scanner(System.in);
		    	        System.out.print("Enter a sentence: ");
		    	        String sentence = scanner.nextLine();

		    	        StringBuilder result = new StringBuilder();  // To store the final result
		    	        String[] words = sentence.split(" ");  // Split sentence into words

		    	        for (String word : words) {
		    	            // If word length is 1 or less, just append it
		    	            if (word.length() <= 1) {
		    	                result.append(word).append(" ");
		    	            } else {
		    	                // Swap first and last characters
		    	                result.append(word.charAt(word.length() - 1));  // Add last letter
		    	                result.append(word.substring(1, word.length() - 1));  // Add middle part
		    	                result.append(word.charAt(0));  // Add first letter
		    	                result.append(" ");  // Add space after each word
		    	            }
		    	        }

		    	        // Print the modified sentence
		    	        System.out.println("Modified sentence: " + result.toString().trim());

		    	        scanner.close();
		    	    
		
		
		

	}

}
