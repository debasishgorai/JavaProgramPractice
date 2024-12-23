package nspii;
public class namean{
	public static void main(String[] args) {
		int[]a= {7,-8,2,9,-8,3,8,8,9,-2};
		print(a);
		for(int n:a) {
			System.out.println(n);
		}
	}

	static void print(int[] a) {
	int left=0;
	int right=a.length-1;
	while(left<right) {
		while(a[left]>=0 && left<right) {
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