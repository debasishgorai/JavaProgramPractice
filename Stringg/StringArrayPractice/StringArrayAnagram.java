package StringArrayPractice;

public class StringArrayAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]s1= {"ram","uu","hf"};
String[]s2= {"ram","hf","uu"};
int []n=new int[s2.length];
for(int i=0;i<=s2.length-1;i++) {
	int na=0;
	for(int j=0;j<s1.length;j++) {
		if(anagram(s2[i],s1[j])) {
		System.out.println("true");
		}
		else {
			System.out.println("false");
		}
			//na++;
	}
}
//	n[i]=na;
//	
//}
//for(int b: n) {
//	System.out.println(b);
//}
	}

	private static boolean anagram(String s1, String s2) {
		// TODO Auto-generated method stub
		while(true) {
			if(s1.length()!=s2.length())return false;
			if(s1.length()==0&&s2.length()==0) return true;
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			
			s2=s2.replace(c+"", "");
		}
		
	}

}
