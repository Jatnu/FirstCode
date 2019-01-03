package testjava;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String temp = "JatinGuptawillsucceed";
		
		char[] Ar = temp.toCharArray();
		
		  Set<Character> tree = new HashSet<Character>();
		  
		    for (char t : Ar) {
		    	if (tree.add(t)==false) {
		    		   System.out.println("Duplicate element is : " + t );	
		    		   
		    		   
		    	}
		    	
		    }
		 
		    System.out.println(tree);
	}

}
