package prgm;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class maxsal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>list=new ArrayList<>();
list.add(123);
list.add(321);
list.add(1255);
list.add(1273);
list.add(1230);
list.add(1239);
System.out.println(list);
Optional<Integer>p=list.stream().min(Integer::compareTo);
p.ifPresent(max->System.out.println(max));
//Optional<Integer>s=list.stream().s(Integer::compareTo);
//p.ifPresent(maxi->System.out.println(maxi));
Optional<Integer>p2=list.stream().distinct().sorted((a,b)->b-a).skip(0).findFirst();
p2.ifPresent(maxi->System.out.println(maxi));


	}

}
