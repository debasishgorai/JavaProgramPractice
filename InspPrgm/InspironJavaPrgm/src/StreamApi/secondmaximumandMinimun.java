package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class secondmaximumandMinimun {
public static void main(String[] args) {
	List<Integer>l=Arrays.asList(8,2,11,5,1,1,2,88,3);
	Optional<Integer>l1=l.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
	l1.ifPresent(max->System.out.println(max));
	//List<Integer>l=Arrays.asList(8,2,11,5,1,1,2,88,3);
	//Optional<Integer>l1=l.stream().distinct().sorted().skip(1).findFirst();
	//l1.ifPresent(max->System.out.println(max));
}
}
