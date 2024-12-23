package prgm;

public class remm {
public static void main(String[] args) {
	String[]a= {"app","tamm","app","tamm","loj"};
	for(int i=0;i<=a.length-1;i++) {
		int count=1;
		for(int j=i+1;j<a.length;j++) {
			if(a[i].equals(a[j])) {
			count++;
			}
		}
		if(count!=2) {
			System.out.println(a[i]);
		}
	}
	
	
}
}
