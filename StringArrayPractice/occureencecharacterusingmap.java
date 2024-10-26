package StringArrayPractice;

import java.util.HashMap;
import java.util.Map;

public class occureencecharacterusingmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ramm";

	Map<Character, String>m=new HashMap<>();
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		if(!m.containsKey(c)) {
			m.put(c, i+"");
		}
	}
	String s1="";
	for(Map.Entry<Character, String>entry:m.entrySet()){
	s1+=entry.getKey()+""+entry.getValue();
	}
	
	System.out.println(s1);
	
	}

}
