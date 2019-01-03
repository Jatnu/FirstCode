package testjava;

public class PlaywithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int[] temp = {3,4,6,2,8,2};
	 // find the index value of 2
	 for(int i=0;i<temp.length;i++) {
		 
		 if(temp[i]==2) {
			 System.out.println("index of 2 is "+i);
			 break; // use of break to break the lopp and come out of it
		 }
	 }

	}

}
