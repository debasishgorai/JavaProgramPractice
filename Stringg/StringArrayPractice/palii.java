package StringArrayPractice;
public class palii{
	public static void main(String[] args) {
		System.out.println(rev("tammmh&&$vvvvv@*iikkdeb"));
	}

	private static String rev(String s) {
		// TODO Auto-generated method stub
		char []a=s.toCharArray();
		int i=0;
		int j=s.length()-1;
		char c=s.charAt(i);
		while(i<=j) {
			if(!isal(a[i])) {
				i++;
			}
			else if(!isal(a[j])) {
				j--;
			}
			else {
				char temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		
		
		return new String(a);
	}

	private static boolean isal(char c) {
		///c/ TODO Auto-generated method stub
		return Character.isLetterOrDigit(c);
	}
}