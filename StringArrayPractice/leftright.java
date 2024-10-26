package StringArrayPractice;

public class leftright {
public static void main(String[] args) {
	int[]a= {1,0,0,1,0};
	sort(a);
	for(int n:a) {
		System.out.println(n);
	}
}

private static void sort(int[] a) {
	// TODO Auto-generated method stub
	int l=0;
	int r=a.length-1;
	while(l<r) {
		while(a[l]==0&& l<r) {
			l++;
		}
		while(a[r]==1 && l<r) {
			r--;
		}
		if(l<r) {
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		
		
		
		
	}
	
}
}
