package Stringg;

public class FindIndexOfCharacter {
public static void main(String[] args) {
	System.out.println(strStr("sadbutsadbutsad","sad"));
}
	public static int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;

    
}
}
