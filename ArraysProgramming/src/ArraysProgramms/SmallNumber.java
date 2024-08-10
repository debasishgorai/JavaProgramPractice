package ArraysProgramms;

public class SmallNumber {
public static void main(String[] args) {
	int[]a= {12,23,56};
	//System.out.println(small);
	int small=a[0];
	for(int i=0;i<=a.length;i++) {
	
		if(a[i]<small) {
			small=a[i];
		}
		
	}
	System.out.println(small);
}
}
