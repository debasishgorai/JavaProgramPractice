package nspii;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class linkedlist {
public static void main(String[] args) {
	
	
int []a= {1,2,2,8,6,6,8,9};

Set<Integer>set=Arrays.stream(a).boxed().collect(Collectors.toSet());
System.out.println(set);
	
}
}
