package TalentPace;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindStarsWithStreamApi {
public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	list.add("ramm");
	list.add("abccddd");
	list.add("aramm");
	List<String>list1=list.stream().filter(p->(p.startsWith("a"))).collect(Collectors.toList());
System.out.println(list1);
}
}
