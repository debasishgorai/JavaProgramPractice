package number;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,5,8,2,9};
sort(a);
for(int n:a) {
	System.out.println(n);
	}
	}
	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		int[]left= new int[a.length/2];
		int[]right=new int[a.length-left.length];
		if(a.length==1) return;
		for(int i=0;i<a.length;i++) {
			left[i]=a[i];
			
		}
		for(int j=0;j<a.length;j++) {
			right[j]=a[j+left.length];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	
		
	}

	private static void merge(int[] a, int[] b, int[] c) {
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