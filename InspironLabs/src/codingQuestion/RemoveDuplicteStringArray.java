package codingQuestion;
import java.util.*;
public class RemoveDuplicteStringArray {


	
	    public static void main(String[] args) {
	        String[] strings = {"apple", "banana", "apple", "orange", "banana", "grape"};

	        // Convert the array to a Set to remove duplicates
	        Set<String> uniqueSet = new HashSet<>();
	        for (String str : strings) {
	            uniqueSet.add(str);
	        }

	        // Convert back to an array (optional)
	        String[] uniqueArray = uniqueSet.toArray(new String[0]);

	        // Print the result
	        System.out.println("Unique elements: " + Arrays.toString(uniqueArray));
	    }
	

}
