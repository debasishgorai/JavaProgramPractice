package Assignment;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int st=1;int sp=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print("* ");
			}
			if(i<=n/2)
			{
				st+=2;sp--;
			}
			else
			{
				st-=2;sp++;
			}
			System.out.println();
			
		}

		
		
	}

}
