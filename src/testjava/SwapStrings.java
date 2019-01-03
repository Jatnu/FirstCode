package testjava;

/**
 * @author jatin.gupta
 *
 */
/**
 * @author jatin.gupta
 *
 */
public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A="Hello";
		String B="World";
		System.out.println("Before Swapping-A-"+A +" "+"B-"+B);
		A = A+B;
		System.out.println(A);

		B= A.substring(0, A.length()-B.length());
		System.out.println(B);
		A=A.substring(A.length()-B.length());
		System.out.println(A);
		System.out.println("After Swapping-A-"+A +" "+"B-"+B);
		
		Integer i= new Integer(10);
	 
	}

}
