package Assignment;

public class rep2 {
	//public class NonRepeatingWordIndexSum {
	    public static void main(String[] args) {
	        String inputString = "hell";

	        int sum = getNonRepeatingWordIndexSum(inputString);

	        System.out.println("Sum of non-repeating word indices: " + sum);
	    }

	    public static int getNonRepeatingWordIndexSum(String input) {
	        String[] words = input.split("\\s+");
	        int[] firstOccurrence = new int[words.length];
	        boolean[] repeated = new boolean[words.length];
	        int sum = 0;

	        for (int i = 0; i < words.length; i++) {
	            String currentWord = words[i].toLowerCase();
	            int index = indexOf(firstOccurrence, currentWord);

	            if (index == -1) {
	                // First occurrence of the word
	                firstOccurrence[i] = i;
	                sum += i;
	            } else {
	                // Mark the word as repeated
	                repeated[index] = true;
	            }
	        }

	        // Adjust sum for repeated words
	        for (int i = 0; i < repeated.length; i++) {
	            if (repeated[i]) {
	                sum -= firstOccurrence[i];
	            }
	        }

	        return sum;
	    }

	    private static int indexOf(int[] array, String value) {
	        for (int i = 0; i < array.length; i++) {
	            if (value.equals(array[i])) {
	                return i;
	            }
	        }
	        return -1;
	    }
	

}
