package Assignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class repu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="rammo";
		 //System.out.println();
	        char []a=s.toCharArray();
	        Map<Character,Integer>m=new  LinkedHashMap<>();
	        int index=-1;
	        for(char ch:a){
	            if(m.containsKey(ch)){
	                m.put(ch, m.get(ch)+1);
	                
	            }else {
	            	m.put(ch, 1);
	            	
	            }
	           // System.out.println(ch);
	        }
	        for(Map.Entry<Character, Integer>e:m.entrySet())
	        {
	        	if(e.getValue()==1) {
	        		index=s.indexOf(e.getKey());
	        		break;
	        	}
	        	return;
	        }
			//return index;
	}

}
