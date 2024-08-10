package StringAssignment;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
		System.out.println(m1(a));
	
		}
				
	public  static String m1(String a)
	{
		char[]c=a.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					return c[i]+"";
				}
			}
		}
		return null;
		
	}

}
