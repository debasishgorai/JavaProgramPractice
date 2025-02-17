package sorting;

public class BubbleSort {

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
			for(int i=0;i<a.length-1;i++) {
				for(int j=0;j<a.length-i-1;j++) {
					if(a[j]>a[j+1]) {
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
	}

}
