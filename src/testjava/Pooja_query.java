package testjava;

import java.util.ArrayList;

public class Pooja_query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String Poo="Pooja and jatin are bestee";
			  
//		
		//String[] Pootemp = new String[Poo.length()];
//		
//		  Pootemp= Poo.split(" ");
//		  
//		  for(int i=0;i<Pootemp.length;i++)
//		  {
//			  //System.out.print(Pootemp[i] +" ");
//		  
//		  
//		   StringBuffer st = new StringBuffer(Pootemp[i]);
//		   System.out.print(st.reverse()+" ");
//		  }
		   		   
		  
		    
		  int i=Poo.length();
			int t=0;
			   // for(int i=0;i<Poo.length();i++)
			   //char[] Pootemp = new char[50];	  
		  ArrayList<String> Pootemp = new ArrayList<String>();
		while(i>t)   
		  
		    {
			       Pootemp.add(Poo.substring(t, Poo.indexOf(" ")));
			       Poo= Poo.replaceAll(Poo.substring(t, Poo.indexOf(" ")), "");
			     t =  Poo.substring(t+1, Poo.indexOf(" ")).length();
			  
			         			   
			     
		    }
		
		     
	     for(int j=0;j<Pootemp.size();j++)
	     {
	    	 System.out.println(Pootemp.get(j));
	     }
		
		
//		int temp= Poo.length();
//		System.out.println(temp);
		
//	char[]	poo1=Poo.toCharArray();
//	
//	   
//	   for (int i=0;i<poo1.length;i++)
//	   {
//		  for(int j=i;
//		   
//	   }
		
	}

}
