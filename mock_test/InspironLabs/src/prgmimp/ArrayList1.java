package prgmimp;

public class ArrayList1 {

	private Object []a=new Object[5];
	private int count=0;
	
	public void add(Object ele) {
		if(count>=a.length) 
			increas();
			a[count++]=ele;
		
		
	}

 void increas() {
		// TODO Auto-generated method stub
		Object[]temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
		
	}
 public void add(int index,Object ele) {
	 if(index<=-1||index>=size()) {
		 throw new IndexOutOfBoundsException();
	 }
	 if(count>=a.length) 
		 increas();
	 for(int i=size()-1;i>=index;i--) {
		 a[i+1]=a[i];
	 }
	 a[index]=ele;
	 count++;
 }
 public void remove(int index) {
	 if(index<=-1||index>=size()) {
		 throw new IndexOutOfBoundsException();
	 }
	 for(int i=index+1;i<size();i++) {
		 a[i-1]=a[i];
		 
	 }
	 count--;
	 a[count]=null;
	 
 }
	public void clear() {
		a=new Object[5];
		count=0;
	}
// }
 public Object get(int index) {
	 if(index<=-1||index>=size()) {
		 throw new IndexOutOfBoundsException();
	 }
	 
	 return a[index];
 }
 public int size() {
	 return count;
 }
	
	
}
