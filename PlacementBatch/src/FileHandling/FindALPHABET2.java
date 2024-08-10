package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindALPHABET2 {
public static void main(String[] args) {
	File f=new File("H:\\Users\\DELL\\Desktop\\dev.txt");
	try {
		String s=findStringFromFile(f);
		String s1=s.toLowerCase();
for(char c='a';c<'z';c++) {
	int a=s1.length()-s1.replace(c+"", "").length();
	System.out.println(c+"  ocuurence is  "+a);
}
	}catch(Exception  e) {
		e.printStackTrace();
		
	}
	
}

private static String findStringFromFile(File f) {
	String temp="";
	try {
		
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine()) {
			temp+=sc.nextLine()+" ";
			
		}
		temp+=temp.trim();
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	return temp;
}
}
