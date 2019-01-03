package testjava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wish="Jatn is happily married to kanni" ;
		
		char[] wishu=wish.toCharArray();
		
 String names[]= {"Jatin" ,"is","living", "happily","Married","life","with","Kanika","happily"};
 		
//		for(int i=0;i<names.length;i++) {
//			
//			for(int j=i+1;j<names.length;j++) {
//				if(names[i].equals(names[j])) {
//					System.out.println("Duplicate Element is- "+names[i]);
//				}
//			}
//		}

	
// Using HashSet
	
//	Set<String> temp = new HashSet<String>();
//	
//	for(String S: names) {
//		if(temp.add(S)==false) {
//			System.out.println("duplicate Element is- "+S );
//		}
//			
//	}	
	
//Using HasMap
	
	Map<Character,Integer> tempo= new HashMap<>();
	
	  for(char S1:wishu) {
		  if(tempo.get(S1)==null) {
		  tempo.put(S1, 1);	 
		  }
		  else {
			 if(tempo.get(S1)>=1) 
		tempo.put(S1, tempo.get(S1)+1);		 
			 }
			  
		  }
	  
	Set<Character> keys = tempo.keySet();
	for(char te:keys) {
		if(tempo.get(te)>1) {
		System.out.println("Duplicate Element is- "+te + tempo.get(te));	
		}
	}
	
	
	}
	
	

}
