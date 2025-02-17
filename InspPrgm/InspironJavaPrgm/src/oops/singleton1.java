package oops;

public class singleton1 {
	private static singleton1 t=null;
	private singleton1() {
		System.out.println("ccc");
	}
	public static singleton1 getin() {
		if(t==null) {
			t=new singleton1();
		
		}
		return t;
		
	}
}
