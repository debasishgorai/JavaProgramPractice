package Assignment;

public class HalloPiramd {
public static void main(String[] args) {
	int n=5;
	int sp=0;
	int st=1;
	for(int i=0;i<=n;i++) {
		for(int j=0;j<=st;j++) {
			System.out.print("");
		}
		System.out.print("*");
	}
	for(int j=0;j<=sp;j++) {
		System.out.println();
	}
	sp++;
	st-=2;
}
}
