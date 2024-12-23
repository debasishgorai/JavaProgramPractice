package prgm;

public class reverse3 {
public static void main(String[] args) {
	int[]a= {1,5,8,4,3,9,7,6,4};
    int spl=-1;
    while(spl==-1) {
    	for(int i=0;i<=a.length-1;i++) {
    		if(a[i]==3) {
    			spl=i;
    			break;
    		}
    	}
    }
	
	//reverse(a,0,a.length-1);
	reverse(a, 0, spl-1);
	reverse(a, spl+1, a.length-1);
	
	for(int n:a) {
		System.out.println(n);
	}
	
	
}

private static void reverse(int[] a, int start, int end) {
	// TODO Auto-generated method stub
while(start<=end) {
	int temp=a[start];
	a[start]=a[end];
	a[end]=temp;
	start++;
	end--;
}
}
}
