package Array;

public class Sortfirsthalfreverselasthalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,5,2,4,7,9,8,6};
sort(a);
reverse(a);

for(int n:a) {
	System.out.println(n);
}
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length/2-1;i++) {
			for(int j=0;j<a.length/2-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

	private static void reverse(int[] a) {
		// TODO Auto-generated method stub
		int start=a.length/2+1;
		int end=a.length-1;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}

}
