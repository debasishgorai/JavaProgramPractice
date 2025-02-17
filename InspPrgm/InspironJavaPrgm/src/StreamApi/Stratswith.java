package StreamApi;
import java.util.*;
import java.util.stream.Collectors;
public class Stratswith {
public static void main(String[] args) {
	List<String>l=Arrays.asList("ram","akash","uuuuu","arrr");
	List<String>l2=l.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
	System.out.println(l2);
	
}
}
