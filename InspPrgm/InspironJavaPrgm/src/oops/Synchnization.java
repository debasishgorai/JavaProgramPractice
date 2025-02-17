package oops;

class A{
	synchronized void display(String message) {
		System.out.println("i am the best"+message);
	

	try {
		Thread.sleep(2000);
	}
	catch(Exception e) {
		System.out.println("k");
	}
	}}
	class B extends Thread{
		A a;
		String message;
		public B(A a,String message){
			this.a=a;
			this.message=message;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
	a.display(message);
		}
	
}




public class Synchnization {
public static  void main(String[] args) {
	A a=new A();
	B b1=new B(a,"i love ");
	B b2=new B(a,"i fuck ");
	b1.start();
	b2.start();
	
	
}
}
