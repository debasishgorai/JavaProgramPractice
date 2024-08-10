package Assignment1;

public class removearray {
	public static void main(String[] args) {
		//int[]a={12,12,48,45,48};
		int[]a= {7,7,1,2,2,5,6,5};
		//int[]temp=new int[a.length];
	    int j=0;
	    //int[] j = new int[a.length];
		for(int i=0;i<a.length-1;i++){
	     // for(int j=0;j<=a.length-1;j++){
	        if(a[i]!=a[i+1]) {
	        	a[j]=a[i];
	        	j++;
	         // System.out.println("after removing duplicate arraya"+a[i]);
	        }
	    }
	        a[j]=a[a.length-1];
	        for(int i=0;i<j;i++) {
	        	System.out.println(a[i]);
	        }
	        
	        //System.out.println(a[i]);
	      
	   // System.out.println(temp[j]);
	    }
	
}
