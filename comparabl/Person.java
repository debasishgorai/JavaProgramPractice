package comparabl;

public class Person implements Comparable<Person> {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person(1,"ram","athabgi",23);
Person p1=new Person(78,"akash","gopi",43);
Person p2=new Person(65,"debasish","jhargrai",65);
Person p3=new Person(11,"ram","athabgi",83);

Person[]pr= {p,p1,p2,p3};
Person[]po=pr ;
for(Person n:po) {
	System.out.println(n);
}
	}
	
	
private int id;
private String name;
private String address;
private int age;
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(int id, String name, String address, int age) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.age = age;
}
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
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public int compareTo(Person o) {
	// TODO Auto-generated method stub
	return this.address.compareTo(o.address);
}

}
