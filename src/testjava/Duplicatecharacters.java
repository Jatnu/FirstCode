package testjava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Duplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 String temp = "Jatin is happily married to Kanika";
 
   Hashtable<Character,Integer> map= new Hashtable<Character,Integer>(); 
   
     char[] Arr = temp.toCharArray(); 
		
        for(char t : Arr) {
        	
        	if(map.containsKey(t)) {
        		
        		map.put(t, map.get(t)+1);
        	}	
        		else { 
        		map.put(t,1);	
        			
        			
        	}
        }
	
	   Set<Character> all = map.keySet();
	
	     for (char dr : all) {
	    	 
	    	 if (map.get(dr)>1) {
	    		 
	    		 System.out.println( dr + ":"+map.get(dr));
	    	 }
	     }
	
	}
	
	

}
