package prgm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class start {
public static void main(String[] args) {
	List<String>s=new ArrayList<>();
	s.add("ssss");
	s.add("tdff");
	s.add("fff");
	List<String >p=s.stream().filter(k->k.startsWith("s")).collect(Collectors.toList());
	System.out.println(p);
	
}
}
