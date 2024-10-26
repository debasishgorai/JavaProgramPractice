package accenture;

public class lefft {
public static void main(String[] args) {
	int[]a= {0,0,1,1,0,1,0,1};
	soet(a);
	for(int n:a) {
		System.out.println(n);
	}
}


static void soet(int[] a) {
	// TODO Auto-generated method stub
	int left=0;
	int right=a.length-1;
	while(left<right) {
	while(a[left]==0 && left<right) 
		left++;
	
	while(a[right]==1 && left<right) 
		right--;
	
	if(left<right) {
		int temp=a[left];
		a[left]=a[right];
		a[right]=temp;
		left++;
		right--;
	}
}
}
}