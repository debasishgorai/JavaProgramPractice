package prgm;

import java.util.Set;

public class REmobeduplicateString {
public static void main(String[] args) {
	
	        String[] input = {"apple", "banana", "apple", "orange", "banana", "grape"};
	        String[] unique = removeDuplicates(input);

	        System.out.println("Array after removing duplicates:");
	        for (String str : unique) {
	            if (str != null) { // Avoid null values in output
	                System.out.print(str + " ");
	            }
	        }
	    }

	    private static String[] removeDuplicates(String[] array) {
	        int n = array.length;
	        String[] temp = new String[n];
	        int index = 0;

	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;

	            for (int j = 0; j < index; j++) {
	                if (array[i].equals(temp[j])) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                temp[index++] = array[i];
	            }
	        }

	        // Return a new array with only the unique elements
	        String[] uniqueArray = new String[index];
	        for (int i = 0; i < index; i++) {
	            uniqueArray[i] = temp[i];
	        }

	        return uniqueArray;

}
}
