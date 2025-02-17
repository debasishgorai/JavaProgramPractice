package Array;

import java.util.Arrays;

public class Reverse3after3 {
public static void main(String[] args) {
	int[]a= {1,1,0,3,5,8};
	int index=-1;
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]==3) {
			index=i;
			break;
		}
	}
	if(index!=-1) {
		reverse(a, 0, index-1);
		reverse(a, index+1, a.length-1);
	}
	System.out.println(Arrays.toString(a));
}

private static void reverse(int[] a,int start,int end) {
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
