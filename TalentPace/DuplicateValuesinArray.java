package TalentPace;

public class DuplicateValuesinArray {
public static void main(String[] args) {
	int[]a= {1,8,2,2,5,3,8,8,4};
	int count=0;
	for(int i=1;i<a.length;i++) {
	//	int count=0;
		
		if(a[i]==a[i-1]) {
			count++;
		}
	
	}
	System.out.println(count);

}
}
