package codingQuestion;
import java.util.*;
public class ArraysGroup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {0, 1, 0, 2, 0, 1, 0, 2};

	        // Map to group elements by their value
	        Map<Integer, List<Integer>> groupedMap = new HashMap<>();

	        // Iterate through the array and group the elements
	        for (int num : a) {
	            groupedMap.putIfAbsent(num, new ArrayList<>());
	            groupedMap.get(num).add(num);
	        }

	        // Extract the grouped lists
	        List<List<Integer>> result = new ArrayList<>(groupedMap.values());

	        // Print the result
	        for (List<Integer> group : result) {
	            System.out.println(group);
	        }
	    
	}

}
