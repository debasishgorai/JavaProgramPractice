package Array;

public class TwoSumBruterforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,8,6,8};
int sum=10;
for(int i=0;i<=a.length-1;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]+a[j]==sum) {
			System.out.println(a[i]+" "+a[j]);
		}
	}
}
	}

}
