package Sorting;

import comparabl.sort;

public class MergeSort {

public static void main(String[] args) {
	int[]a= {1,5,2,8,2,1,4,9};
	sort(a);
	for(int n:a) {
		System.out.println(n);
	}
}

 static void sort(int[] a) {
	// TODO Auto-generated method stub
	 if(a.length==1)return;
	 int[]left=new int[a.length/2];
	 int []rigt=new int[a.length-left.length];
	 for(int i=0;i<left.length;i++) {
		 left[i]=a[i];
	 }
	 for(int j=0;j<rigt.length;j++) {
		 rigt[j]=a[j+left.length];
	 }
	 sort(left);
	 sort(rigt);
	 Merge(left,rigt,a);
	
}

static void Merge(int[] a, int[]b, int[] c) {
	// TODO Auto-generated method stub
	int i=0;
	int j=0;int k=0;
while(i<a.length&&j<b.length) {
	if(a[i]<b[j]) {
		c[k++]=a[i++];
	}else {
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
