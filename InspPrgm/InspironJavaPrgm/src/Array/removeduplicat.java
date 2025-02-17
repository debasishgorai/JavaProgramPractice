package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeduplicat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,1,8,8,5,9};
//Set<Integer>s=new HashSet();
//for(int n:a) {
//
//		s.add(n);
//	
//
//}
//System.out.println(s);

List<Integer>l=new ArrayList<>();
Set<Integer>s=new HashSet();
for(int k:a) {
	if(!s.add(k)) {
		l.add(k);
	}
}
System.out.println(l);
	}

}
