package Sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,5,2,6,1,4};
sort(a,0,a.length-1);
for(int n:a) {
	System.out.println(n);
}
	}

	private static void sort(int[] a,int start,int end) {
		// TODO Auto-generated method stub
		if(start>=end) return;
		int pivot=(start+end)/2;
		int i=start;
		int j=end;
		while(i<=j) {
			if(a[i]<pivot)i++;
			if(a[j]>pivot)j--;
		
		if(i<=j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			
		}
		}
		sort(a,start,j);
		sort(a,i,end);
	}

}
