package prgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class arraysgroup {
public static void main(String[] args) {
	int[]a= {1,0,0,6,0,5,0,1,2,4,2,2,4};
//	Map<Object, List<Integer>>doo=Arrays.stream(a).boxed().collect(Collectors.groupingBy(e->e));
//	System.out.println(doo);
	Map<Integer, List<Integer>>map=new HashMap<>();
	for(int n:a) {
		map.putIfAbsent(n, new ArrayList<>());
		map.get(n).add(n);
		
	}
	List<List<Integer>>map1=new ArrayList<>(map.values());
	System.out.println(map1);
	
}

}
