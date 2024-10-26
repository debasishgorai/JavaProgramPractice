package Sorting;

public class selection {
public static void main(String[] args) {
	int[]a= {1,2,5,9,1,2,3,6,1,2};
	sort(a);
	for(int n:a) {
		System.out.println(n);
	}
}

private static void sort(int[] a) {
	// TODO Auto-generated method stub
	for(int i=0;i<a.length-1;i++) {
		int index=i;
		for(int j=i+1;j<a.length;j++) {
			
			if(a[j]<a[index])
				{
				index=j;
				}
		}
			if(i!=index)
				{
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
				
				
				
				//a[j+1]=temp;
				
				
			
		}}
}
}
