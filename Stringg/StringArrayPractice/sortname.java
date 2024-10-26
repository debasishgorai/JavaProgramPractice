package StringArrayPractice;

public class sortname {
public static void main(String[] args) {
	String []a= {"abccc","abdcde","abcde"};
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1;i++) {
			   if (a[j].compareTo(a[j + 1]) > 0) {
				String temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
		}
	}
		for(String name:a) {
			System.out.println(name);
		}
	
	
}
}
