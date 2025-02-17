package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArraysBoxed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,0,0,0,1,0,2,0,3,0,2,3,3};
Map<Integer, List<Integer>>l=Arrays.stream(a).boxed().collect(Collectors.groupingBy(e->e));
System.out.println(l);

List<List<Integer>>l2=new ArrayList(l.values());
System.out.println(l2);
	}

}
