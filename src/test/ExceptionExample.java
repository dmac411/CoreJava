package test;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array has 3 elements but you are reading for 5
		// you will get error then do exception code using Try {}
		// finally won't catch exception it just does tasks
		
		int[] array = {3,4,5};

		int num = 10;
		
		try {
			int res = num/0;
			System.out.println(array[2]);  // this will error
			// you need to write a catch block for each exception
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Inside the Catch block");

		} catch (ArithmeticException e) {
		System.out.println("Inside the arithmetic exception");
		}
		finally {
			System.out.println("inside finally");
		}
		System.out.println("After Exception");
	}
}
