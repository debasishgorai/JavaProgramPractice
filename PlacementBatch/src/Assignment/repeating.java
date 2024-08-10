package Assignment;

public class repeating {

	public static void main(String[] args) {
		
		    
		        String inputString = "helloworld";

		        int sum = getNonRepeatingIndexSum(inputString);

		        System.out.println("Sum of non-repeating index values: " + sum);
		    }

		    public static int getNonRepeatingIndexSum(String input) {
		        int sum = 0;

		        for (int i = 0; i < input.length(); i++) {
		            boolean isRepeating = false;

		            for (int j = 0; j < input.length(); j++) {
		                if ( input.charAt(i) == input.charAt(j)) {
		                    isRepeating =true;
		                    
		                    break;
		                }
		            }

		            if (!isRepeating) {
		                sum += i;
		            }
		        }

		        return sum;
		    }
		
}
