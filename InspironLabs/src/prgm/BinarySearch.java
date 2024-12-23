package prgm;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,8,6,7,0,6,66};
int index=searcht(a, 66, 0,a.length-1);
System.out.println(index);

	}
	
	

	private static int searcht(int[] a, int ele, int start, int end) {
		// TODO Auto-generated method stub
		
		int mid=(start+end)/2;
		if(ele==a[mid])
			return mid;
	
		else if(a[mid]>ele) {
			return searcht(a, ele, start, mid-1);
			
		}
		else {
			 return searcht(a, ele, mid+1,end);
		}

	}
	
}
