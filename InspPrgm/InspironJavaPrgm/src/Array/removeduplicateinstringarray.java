package Array;

public class removeduplicateinstringarray {
public static void main(String[] args) {
	String[]a= {"ram","ram","kkkkk","kkkkk","jjjj","ghjk"};
	for(int i=0;i<=a.length-1;i++) {
		//int count=0;
		boolean flag=true;
		for(int j=i+1;j<a.length;j++) {
			if(a[i].equals(a[j])) {
				//count++;
				flag=false;
			}
		}
		if(flag) {
			System.out.println(a[i]);
		}
		}
}
}
