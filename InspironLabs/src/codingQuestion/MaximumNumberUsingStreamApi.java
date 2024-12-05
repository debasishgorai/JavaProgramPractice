package codingQuestion;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class MaximumNumberUsingStreamApi {
	public static void main(String[] args) {
		
	
	  List<Integer> numbers = Arrays.asList(10, 20, 35, 50, 5, 90, 25);

      // Find the maximum number using Stream API
      Optional<Integer> maxNumber = numbers.stream()
                                           .max(Integer::compareTo);

      // Print the result
      maxNumber.ifPresentOrElse(
          max -> System.out.println("Maximum number: " + max),
          () -> System.out.println("The list is empty")
      );
}
}
