package TalentPace;

public class Subtact {
public static void main(String[] args) {
	int num=423;
	int product=0;
	int sum=1;
	while(num>0) {
		int rem=num%10;
		sum=sum*rem;
		product+=rem;
		num/=10;
		
	}
	int p=sum-product;
	
	System.out.println(p);
}
}
