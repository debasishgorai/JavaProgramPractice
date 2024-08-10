package FileHandling;

public class BubbleSort {
public static void main(String[] args) {
	int[]a= {12,58,669,45};
	
	for(int n:a) {
		System.out.println(n);
	
	}
	sort(a);
}

 static void sort(int[] a) {
	for(int i=0;i<=a.length-1;i++) {
		for(int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
}
}
