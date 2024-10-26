package Sorting;

public class SelectionSort {
public static void main(String[] args) {
	int[]a= {1,3,4,2,1,3,6,9,1,2};
	sort(a);
	for(int n:a) {
		System.out.println(n);
	}
}

 static void sort(int[] a) {
	// TODO Auto-generated method stub
	for(int i=0;i<a.length-1;i++) {
		int index=i;
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[index]) {
				index=j;
			}
		}
			if(i!=index) {
			int temp=a[index];
	
			a[index]=a[i];
			a[i]=temp;
			
		}}
	
}
}
