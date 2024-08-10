package Assignment1;

public class Pattern1 {
 public static void main(String[] args) {
	int r=5;
	for(int i=1;i<=r;i++) {
		int p=i;
		for(int j=1;j<=i;j++) {
			System.out.print(p);
			p+=r-j;
		}
		System.out.print("");
	}
	System.out.println();
}
}
