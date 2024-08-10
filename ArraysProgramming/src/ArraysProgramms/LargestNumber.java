package ArraysProgramms;

public class LargestNumber {
	public static void main(String[] args) {
		int[]a= {12,56,13,21};
		
		System.out.println(LargestNumber(a));
	}

	private static int LargestNumber(int[] a) {
		int s1=a[0];
		int s2=a[0];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==s1)continue;
			else if(a[i]>s1) {
				s1=s2;
				s1=a[i];
				
			}else if(s1==s2||s2<a[i]) {
				s2=a[i];
			}
		}
		return s1 ;
	}
}
