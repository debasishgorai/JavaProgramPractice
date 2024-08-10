package Assignment;

import FileHandling.A;

public class Repitive {

	public static void main(String[] args) {
	
		String s="rrffk";
		char []a=s.toCharArray();
		int cs(String s) {
		int j=a.length-1;
		int count=0;
		for(int i=0;i<=j;i++) {
			if(s.charAt(i)!=s.charAt(j)) {
				count++;
				i++;
				j--;
			}
		}
			return count;
		
}}

}
