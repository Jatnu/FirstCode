package testjava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate_characters_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String temp="dreamwillcometrue";
		
		char [] tempo = temp.toCharArray();
		
		Set<Character> tree= new HashSet<>();
		
		for (char t : tempo ) {
			
			if(tree.add(t)==false) {
				
				System.out.println(t);
				
			}
		
		
		}
		 
		
		
		
			
			
//			HashMap<String, Integer> tree= new HashMap<>();
//			
//			tree.put("Jatin", 1);
//			tree.put("Kanika",2);
//			tree.put("dreams", 3);
//			tree.put("true", 4);
			
			
			
			
			
	}

}
