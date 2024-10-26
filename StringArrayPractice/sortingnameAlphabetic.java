package StringArrayPractice;

public class sortingnameAlphabetic {
	    public static void main(String[] args) {
	        // Create a String array
	        String[] names = {"John", "Anna", "Mike", "Chris", "Zara"};
	        
	        // Sort the array alphabetically using Bubble Sort
	        for (int i = 0; i < names.length - 1; i++) {
	            for (int j = 0; j < names.length - i - 1; j++) {
	                // Compare two adjacent strings using compareTo()
	                if (names[j].compareTo(names[j + 1]) > 0) {
	                    // Swap names[j] and names[j+1]
	                    String temp = names[j];
	                    names[j] = names[j + 1];
	                    names[j + 1] = temp;
	                }
	            }
	        }

	        // Print the sorted array
	        System.out.println("Sorted names: ");
	        for (String name : names) {
	            System.out.println(name);
	        }
	    }
	

}
