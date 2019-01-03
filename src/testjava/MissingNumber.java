package testjava;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] temp = {1,2,3,5};
		int sum=0;
		int sum2=0;
		for(int i=0;i<temp.length;i++) {
			sum = sum +temp[i];
			}
		System.out.println(sum);
		
		for(int j=1;j<=5;j++) {
			sum2= sum2+j;
			}
		System.out.println(sum2);
		
		System.out.println(sum2-sum);

	}

}
