package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Employee e= new Employee(12, "ramm", "athangi", 78990);
   Employee e1= new Employee(1, "kramm", "ooathangi", 7878990);
	
   Employee e2= new Employee(12788, "ooramm", "apthangi", 78990);
   
	
	
List<Employee>l=new ArrayList<>();
l.add(e);
l.add(e1);
l.add(e2);
Collections.sort(l,new Comparator<Employee>() {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		//return o1.getId()-o2.getId();
		return o1.getAddress().compareTo(o2.getAddress());
	}
});
for(Employee n:l) {
	System.out.println(n);
}
	}
}