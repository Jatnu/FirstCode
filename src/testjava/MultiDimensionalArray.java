package testjava;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] Twod = {{1,2,3},{4,5,6},{-8,3,5}};
		
//		System.out.println(Twod.length);
//		for(int i=0;i<3;i++) 
//		{
//			
//			for(int j=0;j<3;j++)
//			{
//			System.out.print(" "+Twod[i][j]);
//		}
//		System.out.println("");
//		System.out.println("");
//
//	}

		
		
		// Print minimum no. from above matrix
		
		int smallest=Twod[0][0];
		
		System.out.println(Twod.length);
		for(int i=0;i<Twod.length;i++) 
		{
			
			for(int j=0;j<Twod[i].length;j++)
			{
				if(smallest > Twod[i][j]) {
					smallest=Twod[i][j];
					
				}
			System.out.print(" "+Twod[i][j]);
		}
			System.out.println("");
			System.out.println("");
			
	
	}
		System.out.println("Smallest no. "+smallest);
		
		
		
		
}
}
