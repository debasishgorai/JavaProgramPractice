package pattern;

public class onethrepatherb {

	    public static void main(String[] args) {
	        // First part - Odd numbers in decreasing number of elements
	        for (int i = 5; i >= 1; i--) {
	            for (int j = 1; j <= i * 2 - 1; j += 2) {
	                System.out.print(j + " ");
	            }
	            System.out.println();  // Move to the next line
	        }
	        
	        // Second part - Even numbers in increasing number of elements
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 2; j <= i * 2; j += 2) {
	                System.out.print(j + " ");
	            }
	            System.out.println();  // Move to the next line
	        }
	   

}
}
