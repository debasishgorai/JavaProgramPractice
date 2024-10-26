package Stringg;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(length(" llllll uuuu ffffff yukjkjnb"));
	}

	private static int  length(String s) {
		// TODO Auto-generated method stub
	    s = s.trim(); 
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

	

}
