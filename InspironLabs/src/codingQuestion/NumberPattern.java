package codingQuestion;

public class NumberPattern {
	    public static void main(String[] args) {
//	        int n = 10;  // Number of terms in the sequence
//	        int power = 1; // Initial power of 5
//	        for (int i = 1; i <= n; i++) {
//	            if (i % 2 != 0) { // Odd terms: powers of 5
//	                System.out.print((int) Math.pow(5, power) + " ");
//	                power++; // Increment the power of 5 after each odd term
//	            } else { // Even terms: powers of 5 + 5
//	                System.out.print((int) Math.pow(5, power - 1) + 5 + " ");
//	            }
//	        }
//	    
//	}
	
	    	    
	    	        int n = 10; // Number of terms to generate
	    	        int currentPower = 1; // The initial power to calculate (5^1, 5^2, 5^3,...)

	    	        for (int i = 1; i <= n; i++) {
	    	            // For odd-indexed terms (1st, 3rd, 5th, 7th, ...), we print powers of 5
	    	            if (i % 2 != 0) {
	    	                System.out.print((int) Math.pow(5, currentPower) + " ");
	    	                currentPower++; // Increment power for the next odd term
	    	            } else { // For even-indexed terms (2nd, 4th, 6th, 8th, ...), print power of 5 + 5
	    	                System.out.print((int) Math.pow(5, currentPower - 1) + 5 + " ");
	    	            }
	    	        }
	    	    }
	   


}
