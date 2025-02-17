package Array;

public class linearsearcg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {12,05,10,5,8};
		System.out.println(search(a,10));
			}

	private static int search(int[] a,int ele) {
		// TODO Auto-generated method stub
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==ele) {
				return i;
			}
		}
		return -1;
	}
	

}
