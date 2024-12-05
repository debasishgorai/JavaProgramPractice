package codingQuestion;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        int[]a= {23,56,78,90,87,67};
        sort(a);
        for(int n:a) {
       	 System.out.println(n);
        }
        
	}

	public static void sort(int[] a) {
		// TODO Auto-generated method stub
		if(a.length==1)return;
		int[]left=new int[a.length/2];
		int[]right= new int[a.length-left.length];
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
			
		}
		for(int i=0;i<right.length;i++) {
			right[i]=a[i+left.length];
			
		}
		sort(left);
		sort(right);
		merge(left,right,a);
		
		
	}

	private static void merge(int[] a, int[]b, int[] c) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				k++;
				i++;
			}
			else {
				c[k]=b[j];
				k++;
				j++;
				
			}
		}
		while(i<a.length) {
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			c[k]=b[j];
			j++;
			k++;
		}
	}

}
