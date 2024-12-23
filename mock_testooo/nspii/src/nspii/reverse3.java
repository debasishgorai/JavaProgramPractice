package nspii;

public class reverse3 {
public static void main(String[] args) {
	int[]a= {7,9,3,8,2,7};
	
	int index=-1;
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]==3) {
			index=i;
			break;
		}
	}
	sort(a, 0, index-1);
	sort(a, index+1, a.length-1);
	for(int n:a) {
		System.out.println(n);
	}
	
	

}

private static void sort(int[] a,int start,int end) {
	// TODO Auto-generated method stub
while(start<end) {
	int temp=a[start];
	a[start]=a[end];
	a[end]=temp;
	start++;
	end--;
}
}
}
