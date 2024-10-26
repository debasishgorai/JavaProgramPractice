package TalentPace;

public class DiamondPattern {

	public static void main(String[] args) {
		int n=5;
		int sp=n-1;
		int st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			st++;
			sp--;
		}
	 n=5;
		 sp=1;
		 st=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			st--;
			sp++;
		}
	
	}
}
