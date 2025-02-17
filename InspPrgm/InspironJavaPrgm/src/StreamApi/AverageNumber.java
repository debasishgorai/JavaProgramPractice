package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageNumber {
public static void main(String[] args) {
	List<Integer>l=Arrays.asList(8,2,11,5,1,88,3);
	 double l2=l.stream().mapToInt(Integer::intValue).average().orElse(0);
	
	System.out.println(l2);
}
}
