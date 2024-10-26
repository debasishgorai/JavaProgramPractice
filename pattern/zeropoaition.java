package pattern;

public class zeropoaition {

	    public static void main(String[] args) {
	   
	    	        int n = 5;  // Size of the pattern
	    	        
	    	        // Iterate through rows
	    	        for (int i = 1; i <= n; i++) {
	    	            // Iterate through columns
	    	            for (int j = 1; j <= n; j++) {
	    	                if (j <= n - i) {
	    	                    // Print 0 for the first few columns
	    	                    System.out.print("0 ");
	    	                } else {
	    	                    // Print the row number for the remaining columns
	    	                    System.out.print(i + " ");
	    	                }
	    	            }
	    	            // Move to the next line after each row
	    	            System.out.println();
	    	        }
	    	    

}
}
