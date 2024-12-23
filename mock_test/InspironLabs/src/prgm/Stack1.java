package prgm;

import java.util.Stack;

public class Stack1 {
public static void main(String[] args) {
	System.out.println(isb("[({})]"));
}

private static boolean isb(String s) {
	// TODO Auto-generated method stub
	Stack<Character>s1=new Stack<Character>();
	for(int i=0;i<=s.length()-1;i++) {
		char c=s.charAt(i);
		if(c=='['||c=='{'||c=='(') {
			s1.push(c);
		}
		else if(c==']'||c=='}'||c==')') {
			if(s1.isEmpty()||!pair(s1.pop(),c)) {
				return false;
			}
		}
	}
	
	return s1.isEmpty();
}

private static boolean pair(char c1, char c2) {
	// TODO Auto-generated method stub
	if(c1=='['&&c2==']') return true;
	if(c1=='{'&&c2=='}') return true;
	if(c1=='('&&c2==')') return true;
	return false;
}
}
