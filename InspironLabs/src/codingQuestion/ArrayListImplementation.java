package codingQuestion;

import java.util.ArrayList;

public class ArrayListImplementation {

	private Object[]a=new Object[5];
	private int p=0;
	public void add(Object ele) {
	
		if(p>=a.length) increase();
		a[p++]=ele;
	}
	public int size() {
		return p;
	}
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}

	public void increase() {
		Object[]temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	public void add(int index,Object ele) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(p>=a.length)increase();
		for(int i=size()-1;i>=index;i--) {
	a[i+1]=a[i];
			
		}
		a[index]=ele;
		p++;
	}
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=index+1;i<size();i++) {
			a[i-1]=a[i];
			
		}
		p--;
		a[p]=null;
	}
	public void clear() {
		a= new Object[5];
		p=0;
		
		
		
}

	public static void main(String[] args) {
		ArrayList al1= new ArrayList();
	al1.add(10);
	al1.add(20);
	al1.add(30);
	al1.add(40);
	al1.add(50);
	al1.add(60);
	al1.add(2,70);
	al1.add(80);
	al1.remove(1);
	for(int i=0;i<al1.size();i++) {
		System.out.println(al1.get(i));
	}
	}}
