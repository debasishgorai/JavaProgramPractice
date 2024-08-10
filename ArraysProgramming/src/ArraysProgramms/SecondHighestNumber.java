package ArraysProgramms;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int[]a= {12,56,21,21,55,55};
		
		System.out.print(secondHighest(a));
	}

	
		private static int secondHighest(int[] a) {
	
		int s1=a[0];
		int s2=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]==s1)continue;
			else if(a[i]>s1) {
				s2=s1;
				s1=a[i];
				
			}else if(s1==s2||s2<a[i]) {
				s2=a[i];
			}
		}
		return s2 ;
	}
}
