package pattern;

public class pscalp {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<n;i++) {
		for(int j=1;j<n-i;j++) {
			int num=1;
			num+=(i-j)/i+j;
			System.out.println(num);
		}
		
	}
}
}
