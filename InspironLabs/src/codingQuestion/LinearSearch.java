package codingQuestion;

public class LinearSearch {
	public static void main(String[] args) {
		
	
	int[]a= {1,2,4,8,7,3};
	System.out.println(search(a,2));
	System.out.println(search(a,3));
	

}
public static int search(int[]a,int ele) {
for(int i=0;i<a.length;i++) {
	if(a[i]==ele)return i;
	
}
return -1;
}
}
