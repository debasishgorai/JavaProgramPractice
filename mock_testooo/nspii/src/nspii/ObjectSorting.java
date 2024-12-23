package nspii;
import java.util.*;
public class ObjectSorting  {

public static void main(String[] args) {
	Employee e= new Employee(77, "ashish", 1200, "pritaangi");
	Employee e1= new Employee(12, "pramm", 7700, "ktthangi");
	Employee e2= new Employee(488, "cttamm", 12000, "athangi");
	Employee e3= new Employee(120, "fghamm",800, "llthangi");
	Employee e4= new Employee(124, "akamm", 1800, "eethangi");

	 List<Employee> employees = new ArrayList<>();
     employees.add(e);
     employees.add(e1);
     employees.add(e2);
     employees.add(e3);
     Collections.sort(employees, new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	});
     
 // Collections.sort(employees);
     for(Employee emp:employees) {
    	 System.out.println(emp);
     }
	
	
	
}













}
