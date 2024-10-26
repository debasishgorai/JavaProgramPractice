package StringArrayPractice;

public class panagramUsingRecursion {
public static void main(String[] args) {
	String s="qwertyuioplkjhgfdsazxcvbnm";
	System.out.println(pana(s));
}

private static boolean pana(String s) {
	// TODO Auto-generated method stub
	for(char c='a';c<='z';c++) {
		if(!s.contains(c+""))return false;
	}

	return true;
}
}
