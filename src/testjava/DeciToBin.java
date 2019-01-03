package testjava;

public class DeciToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp = 14;
		int i=0;
		int j=0;
		int [] te = new int[30];
		
		while (temp>0) {
			te[i]=temp%2;
			temp= temp/2;
			i++;		
	} 
		for(j=i-1;j>=0 ; j-- ) 
			System.out.print( te[j] );
			
		
		
	
	
	
	String t =new String ("Hello") ;
	String d =new String ("Hello") ;
	 String s = "dream";
	 String q=s;
	
	 System.out.println(t==d) ;
	 System.out.println(s==q) ;
	 
	
	
	
}
}