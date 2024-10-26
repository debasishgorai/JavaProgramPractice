package TalentPace;

import java.util.Arrays;

public class LeftRight {
public static void main(String[] args) {
	
	
	
	int[]a= {1,8,9,5,0,4,0,7,0};
	//Arrays.sort(a);
	sort(a);
	for(int n:a) {
		System.out.println(n);
	}
}

private static void sort(int[] a) {
	// TODO Auto-generated method stub
	int l=0;
	int r=a.length-1;
	while(l<r) {
		while(a[l]==0&& l<r) {
			l++;
		}
		while(a[r]!=0 && l<r) {
			r--;
		}
		if(l<r) {
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		
		
		
		
	}
}


}
