package Array;

public class leftright {
public static void main(String[] args) {
	int[]a= {1,-1,-4,8,-5,6,-9};
	sort(a);
	for(int n:a) {
		System.out.println(n);
	}
}

private static void sort(int[] a) {
	// TODO Auto-generated method stub
	int left=0;
	int right=a.length-1;
	while(left<right) {
		while(a[left]>=0&&left<right) {
			left++;
		}
		while(a[right]<=0&&left<right) {
			right--;
		}
		if(left<right) {
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
	}
}
}
