package testjava;

import java.util.HashMap;
import java.util.Set;

public class Strings_Character_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String temp="Wahe guruji ne fariyad sunli";
	
	char[] arr = temp.toCharArray();
	
	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	
	  for (char c : arr) {
		  
		  if (map.containsKey(c)) {
			  
			  map.put(c, map.get(c)+1);
		  }
		  
		  else
		  {
			  map.put(c, 1);
			  
		  }
			  		  
	  }
	  
	  
	  Set<Character> all = map.keySet();
	  
	  for (char a : all) {
		  
	if (map.get(a)>1 ){
		System.out.println("Duplicate elements in "+ temp +" " +a+" "+ map.get(a));
		
	}
	  }
		
		

	}

}
