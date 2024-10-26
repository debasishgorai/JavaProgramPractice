package Searching;

public class secondele {
public static void main(String[] args) {
	int[]a= {1,8,6,77,54};
	System.out.println(rev(a));
}

private static int rev(int[] a) {
	// TODO Auto-generated method stub
	int s1=a[0];
	int s2=a[0];
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]==s1)continue;
	if(s1>a[i]) {
		s1=s2;
		s1=a[i];
	
		
	}
	else if(s1==s2&&s2>a[i]) {
		s2=a[i];
	}
		
		
	}
	return s1;
}
}
