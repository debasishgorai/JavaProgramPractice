package StringArrayPractice;

public class secondoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rrrrruuuuuukkkkoooofffff";
		char d='\u0000';
		char d1='\u0000';

		int max=0;
		int sec=0;
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			String s1=s.replace(c+"","");
			int count=s.length()-s1.length();
			if(count>max) {
				d1=d;
				sec=max;
				max=count;
				d=c;
				
			}
			else if(count>sec & count<max) {
				sec=max;
				d1=d;
				
			}
		}
		System.out.println(d1+"   "+sec);
		System.out.println(d+"     "+max);
	}

}
