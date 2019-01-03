package testjava;

public class IntCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int te=22;
		int sum=0;
		for(int i=0;i<=te;i++) {
		
		 sum = sum+IntCount.count(i,2);
					
		}
		System.out.println(sum);
		 	
		
	}
	
	
	public static int count(int num, int j) {
		 
		  int count=0;
		  int rev=0;
		while (num!=0)
		{
			rev =  num % 10; //
			num = num / 10; // 1234
			
			if( rev==j)
			{
				count=count+1;
				
			}
			}
		return count;
		
		
	}
	

}
