package sorting;

public class SelectionSort {

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
			for(int i=0;i<=a.length-1;i++) {
				int index=i;
				for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index=j;
				}
				if(i!=index) {
					int temp=a[index];
					a[index]=a[i];
					a[i]=temp;
				}
				}
			
	}
		}
}
