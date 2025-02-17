package oops;

class thread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("yyyyyy dfghj");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}
public class runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
thread t=new thread();
Thread t2=new Thread(t);
t2.start();

	}

}
