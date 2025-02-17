package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Comparable.Employee;

class employee{
	private int id;
	private String name;
	private int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}





public class sortingBYnamesAndSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
employee e= new employee(12, "ramm", 102222);
employee e1= new employee(120, "akash", 102899999);
employee e2= new employee(1245555, "sushm", 1022);
employee e3= new employee(1255, "kddddsh", 102);
employee e4= new employee(124, "suushm", 1022);
List<employee>l=new ArrayList<>();

l.add(e);
l.add(e1);
l.add(e2);
//List<employee>l2=l.stream().sorted(Comparator.comparing(employee::getSal)).collect(Collectors.toList());
//System.out.println(l2);
List<employee>l2=l.stream().sorted(Comparator.comparing(employee::getSal,Comparator.reverseOrder())).collect(Collectors.toList());
System.out.println(l2);



	}

}
