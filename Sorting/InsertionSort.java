package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,3,6,4,4};
sort(a);
for(int n:a) {
	System.out.println(n);
}
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=1;i<a.length;i++) {
			int k=a[i];
			int j=i-1;
			if(j>=0&&a[j]>k) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=k;
		}
	}

}
