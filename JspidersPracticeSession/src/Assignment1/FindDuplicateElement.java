package Assignment1;

public class FindDuplicateElement {
public static void main(String[] args) {
	int[]a= {1,2,8,8};
	for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1;j<=a.length-1;j++) {
			
		
		if(a[i]==a[j] & i!=j) {
			System.out.println(a[j]);
		}
	}}
	
}
}
