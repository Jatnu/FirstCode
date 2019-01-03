package testjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String t= "I am taking care of kanika and our baby";
		
		char[] tempo = t.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c:tempo)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			
		}
		
		Set<Character> keys=map.keySet();
		
		for( char k: keys) 
		{
			if(map.get(k)>1) {
				System.out.println("duplicate characters are: " + k +" " +map.get(k));
			}
			
		}
		
		

	}

}
