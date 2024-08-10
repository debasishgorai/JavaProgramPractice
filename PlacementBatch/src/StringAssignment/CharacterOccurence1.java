package StringAssignment;

import java.util.Scanner;

public class CharacterOccurence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("enter name:");
         String s=sc.nextLine();
         char ch='a';
    int count=0;
while(s.length()>0) {
	char c= s.charAt(0);
	String s1= s.replace(c+"", "");
	int length =s.length()-s1.length();
	if(length>count) {
		count=length;
		ch=c;
	}else if(length==count) {
	ch=c;	
	}
	System.out.println(c+"="+count);
	s=s1;
}
	
	}

}
