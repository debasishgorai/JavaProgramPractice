package Comparable;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private String Address;
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
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String address, int sal) {
	
	this.id = id;
	this.name = name;
	Address = address;
	this.sal=sal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", Address=" + Address + ", sal=" + sal + "]";
}
@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return o.id-this.id;
}

}
