package TalentPace;

public class SumofTheGivenInteger {
public static void main(String[] args) {
	int[]a= {1,8,5,7,5};
	
	System.out.println(sumele(a));
}

private static int sumele(int[] a) {
	// TODO Auto-generated method stub
	int sum=0;
	int strt=2;
	int end=4;
	for(int i=strt;i<=end &&i<=a.length-1;i++) {
		sum+=a[i];
	}
	return sum;
}
}
