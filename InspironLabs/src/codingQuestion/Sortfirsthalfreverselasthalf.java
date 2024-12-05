package codingQuestion;

public class Sortfirsthalfreverselasthalf {
	    // Method to sort the left half of the array using Bubble Sort
	    public static void sortLeftHalf(int[] arr) {
	        int mid = arr.length / 2;
	        
	        // Bubble sort for left half
	        for (int i = 0; i < mid - 1; i++) {
	            for (int j = 0; j < mid - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap elements
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    // Method to reverse the right half of the array
	    public static void reverseRightHalf(int[] arr) {
	        int mid = arr.length / 2;
	        
	        // Reverse the right half of the array
	        int start = mid;
	        int end = arr.length - 1;
	        
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }

	    // Main method to demonstrate the solution
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 5, 6, 3, 7};  // Example array

	        System.out.println("Original Array:");
	        printArray(arr);

	        // Sort the left half
	        sortLeftHalf(arr);

	        // Reverse the right half
	        reverseRightHalf(arr);

	        System.out.println("Modified Array:");
	        printArray(arr);
	    }

	    // Method to print the array
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	

}
