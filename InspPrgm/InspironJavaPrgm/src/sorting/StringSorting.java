package sorting;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]a= {"ram","akash","kitt","aksdff","gggggg"};

sort(a);
for(String n:a) {
	System.out.println(n);
}

}

	private static void sort(String[] a) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=a.length-1;i++) {
			//boolean flag=true;
			for(int j=i+1;j<a.length;j++) {
				if(a[i].compareTo(a[j])>0) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}}
	}

}
