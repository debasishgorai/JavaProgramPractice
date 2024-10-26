package StringArrayPractice;

public class spiralPattern {

	public static void main(String[] args) {
	
// TODO Auto-generated method stub
int[][]a=spiral(6);
for(int[] temp:a) {
	System.out.print(temp);
}
System.out.println();
	}

	private static int[][] spiral(int size) {
		// TODO Auto-generated method stub
		int[][]a=new int[size][size];
		int row=0;
		int column=-1;
		char m='r';
		for(int i=1;i<=size*size;i++) {
			
			switch (m) {
			case 'r':column++;
			a[row][column]=i;
			if(column==size-1||a[row][column+1]!=0)m='d';
			break;
			
			
			
			
		}
		
		
		return a;
	}

}
