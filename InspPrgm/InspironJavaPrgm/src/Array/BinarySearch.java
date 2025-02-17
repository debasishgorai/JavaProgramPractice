package Array;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {12,05,10,5,8};
System.out.println(sarch(a,10,0,a.length-1));
	}

	private static int sarch(int[] a, int ele, int start, int end) {
		// TODO Auto-generated method stub
		int mid=(start+end)/2;
		if(ele==a[mid])
		return mid;
		else if(a[mid]>ele) {
			return sarch(a, ele, start, mid-1);
			
			
		}
		else
			return sarch(a, ele, mid+1, end);
	}

}
