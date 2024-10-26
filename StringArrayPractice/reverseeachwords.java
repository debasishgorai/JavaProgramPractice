package StringArrayPractice;

public class reverseeachwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,5,6,4,8,5};
int res=10;

for(int i=0;i<=a.length-1;i++) {
	
	for(int j=i+1;j<a.length;j++) {
		int sum=a[i]+a[j];
		if(sum==res) {
			System.out.println(a[i]+","+a[j]);
		}
	}



	
}
	}

}
