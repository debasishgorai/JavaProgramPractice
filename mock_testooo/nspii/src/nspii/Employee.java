package nspii;

public class Employee  implements Comparable<Employee> {
 private int id;
 @Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
}
private String name;
 private int sal;
 private String address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Employee(int id, String name,int  sal, String address) {
	
	this.id = id;
	this.name = name;
	this.sal = sal;
	this.address = address;
}
@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return this.sal-o.sal;
}

}
