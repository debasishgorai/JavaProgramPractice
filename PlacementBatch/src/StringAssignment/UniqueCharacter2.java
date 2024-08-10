package StringAssignment;

public class UniqueCharacter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="EDveloperb";
		String s=a.toLowerCase();
		char ch=s.charAt(0);
		for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
			
			if(m(s,c)==1) {
				if((""+c).compareToIgnoreCase(c+"")>0)
					ch=c;
			}
				
				
				//System.out.println(ch);
			//return;
		}
		System.out.println(ch);

	}

	public static int m(String s, char c) {
		// TODO Auto-generated method stub
		return s.length()-(s.replace(""+c,"").length());
	}

}
