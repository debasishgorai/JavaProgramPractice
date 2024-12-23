package prgmimp;

public class Test {
	public static void main(String[] args) {
		ArrayList1 a1=new ArrayList1();
		a1.add(10);
		a1.add(10);
		a1.add(15);
		a1.add(11);
		a1.add(12);
		a1.add(21);
		a1.remove(3);
		a1.add(2,70);
		//a1.add(108);
		//a1.clear();
		for(int i=0;i<a1.size();i++) {
		System.out.println(a1.get(i));
		}
	}
}