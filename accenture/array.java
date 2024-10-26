package accenture;

public class array {
public static void main(String[] args) {
	int[]a= {1,3,6,3,5,4,8,31,2,31};
	int sum=33;
	int product=62;
	for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]&&a[i]+a[j]==sum&&a[i]*a[j]==product) {
				System.out.println(a[i]+","+a[j]);
			}
		}
	}
	
}
}
