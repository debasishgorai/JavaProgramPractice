package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,8,6,9,5,2};
		sort(a);
		for(int n:a) {
		System.out.println(n);
	}
	}
		private static void sort(int[] a) {
			// TODO Auto-generated method stub
			for(int i=1;i<=a.length-1;i++) {
				int j=i-1;
				int k=a[i];
				while(j>=-1&&a[j]>k) {
					a[j+1]=a[j];
					j--;
				}
				a[j+1]=k;
			}
	
	}

}
