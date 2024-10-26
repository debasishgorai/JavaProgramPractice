package TalentPace;

public class DecimalToBinaryCountOne {
	public static void main(String[] args) {
		
	
	int num=23;
	 int i = 1;
	 int bin = 0;
	 int rem =0;

	 while(num>0) {
		 rem = num%2;
		 bin=(rem*i)+bin;
		 num= num/2;
		 i*=10;
		 
		 
	 }
	System.out.println(bin);
	int count=0;
	while(bin >0) {
		int last = bin%10;
		if(last ==1)
			count++;
		
		bin/=10;
		
	}
	System.out.println(count);
	}
}
