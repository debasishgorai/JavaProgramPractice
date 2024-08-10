package Assignment;

import java.util.ArrayList;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {0,1,2,3,4,5,6,7,8,9};
  int rows=3;
  int columns=3;
  
 

	List<List<Integer>>matrix=new ArrayList<>();
	int index=0;
	for(int i=0;i<=rows;i++) {
		List<Integer>row=new ArrayList<>();
		for(int j=1;j<=columns;j++) {
	  if(index<a.length) {
		  row.add(a[index]);
		  index++;
	  }
		}
		matrix.add(row);
	}
	for(List<Integer>row:matrix) {
		System.out.println(row);
	}
	// System.out.println();
	//System.out.println(index);
	}
}
