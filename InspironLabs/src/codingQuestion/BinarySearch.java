package codingQuestion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	       int[]a= {7,43,45,65,78};
//	        System.out.println(search(a,65));
//
//	}
//	public static int search(int[]a,int ele) {
//		int start=0,end=a.length-1,mid;
//		while(start<=end) {
//			mid=(start+end)/2;
//			if(ele==a[mid]) return mid;
//			else if(ele<a[mid]) end=mid-1;
//			else start =mid+1;
//			
//			
//		}
//		return -1;
//		
		int[]a= {3,4,7,12,14};
		int index=search(a,12,0,a.length-1);
		System.out.println(index);
		index = search(a,7,0,a.length-1);
		System.out.println(index);

	}
	 public static int search(int[]a,int ele,int start,int end) {
		int mid= (start+end)/2;
		if(start>mid)return -1;
		//int mid=(start+end)/2;
		if(ele==a[mid]) {
			return mid;
		}
		else if(ele<a[mid]) {
			return search(a,ele,start,mid-1);
		}
		else {
			return search(a,ele,mid+1,end);
			
		}
	}

}
