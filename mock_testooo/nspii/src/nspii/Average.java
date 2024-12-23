package nspii;

import java.util.Arrays;
import java.util.List;

public class Average {
public static void main(String[] args) {
	//List<Integer>list=Arrays.asList(1,8,9,8,10,89);
	//double avg=list.stream().mapToInt(Integer::intValue).average().orElse(0);
	//System.out.println(avg);
	
	int[]a= {1,8,9,8,10,90};
	double av=Arrays.stream(a).average().orElse(0);
	System.out.println(av);
	
}

}
