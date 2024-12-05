package codingQuestion;
import java.util.*;
import java.util.stream.Collectors;
public class ArraysGroup {
	

	    public static void main(String[] args) {
	        int[] a = {0, 1, 0, 2, 0, 1, 0, 2};

	        // Group elements based on their values
	        Map<Integer, List<Integer>> groupedMap = Arrays.stream(a)
	                                                       .boxed() // Convert int to Integer for Stream API
	                                                       .collect(Collectors.groupingBy(e -> e));

	        // Extract the grouped lists
	        List<List<Integer>> result = new ArrayList<>(groupedMap.values());

	        // Print the result
	        result.forEach(System.out::println);
	    }
	

}
