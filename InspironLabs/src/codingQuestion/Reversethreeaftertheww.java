package codingQuestion;
import java.util.Arrays;
public class Reversethreeaftertheww {



	    public static void main(String[] args) {
	        int[] arr = {1, 1, 0, 3, 2, 0, 1, 2};
	        
	        // Find the index of 3 in the array
	        int indexOfThree = -1;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 3) {
	                indexOfThree = i;
	                break;
	            }
	        }
	        
	        if (indexOfThree != -1) {
	            // Reverse the part before 3
	            reverseArray(arr, 0, indexOfThree - 1);

	            // Reverse the part after 3
	            reverseArray(arr, indexOfThree + 1, arr.length - 1);
	        }

	        // Output the modified array
	        System.out.println(Arrays.toString(arr));
	    }

	    // Helper function to reverse a part of the array
	    private static void reverseArray(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	

}
