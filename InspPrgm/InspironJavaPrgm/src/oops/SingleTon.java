package oops;


public class SingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
singleton1 s=singleton1.getin();
singleton1 s1=singleton1.getin();
singleton1 s2=singleton1.getin();

System.out.println(s.hashCode());
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
	}

}
