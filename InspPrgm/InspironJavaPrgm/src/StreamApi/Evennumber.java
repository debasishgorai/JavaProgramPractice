package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>l=Arrays.asList(8,2,11,5,1,88,3);
List<Integer>l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(l2);
	}

}
