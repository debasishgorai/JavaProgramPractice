package sorting;

public class mergesort {

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
		
			if(a.length==1)return;
			int[]left=new int[a.length/2];
			int []right= new int[a.length-left.length];
			for(int i=0;i<left.length;i++) {
				left[i]=a[i];
				
			}
			for(int j=0;j<right.length;j++) {
				right[j]=a[j+left.length];
				
			}
	sort(left);
	sort(right);
	merge(left,right,a);
	
	}
		 static void merge(int[] a, int[]b, int[] c) {
			// TODO Auto-generated method stub
			 int i=0;
			 int j=0;
			 int k=0;
			 while(i<a.length&&j<b.length) {
				 if(a[i]<b[j]) {
					 c[k++]=a[i++];
					 
				 }
				 else {
					 c[k++]=b[j++];
				 }
				 
			 }
			while(i<a.length) {
				c[k++]=a[i++];
			}
			while(j<b.length) {
				c[k++]=b[j++];
			}
		}

}
