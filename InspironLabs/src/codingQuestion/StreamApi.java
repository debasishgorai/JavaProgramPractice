package codingQuestion;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	
	
	    public static void main(String[] args) {
	        // Example list of strings
	        List<String> strings = Arrays.asList("Apple", "Banana", "Kiwi", "Kite", "Orange", "Kangaroo");

	        // Use Stream API to find strings starting with "K"
	        List<String> result = strings.stream()
	                                     .filter(s -> s.startsWith("K"))
	                                     .collect(Collectors.toList());

	        // Print the result
	        System.out.println("Strings starting with 'K': " + result);
	    }
	

}
