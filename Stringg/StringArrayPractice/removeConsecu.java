package StringArrayPractice;

public class removeConsecu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="rammmjgjjhhh";
String res="";
for(int i=1;i<s.length();i++) {
	
	if(s.charAt(i)!=s.charAt(i-1)){
	res+=s.charAt(i-1);
	}
}
res+=s.charAt(s.length()-1);
System.out.println(res);
	}

}
