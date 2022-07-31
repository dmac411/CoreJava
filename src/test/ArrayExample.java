package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array01 = {10,20,30,40,50};
		System.out.println("Total Numbers are " + array01.length);
		System.out.println("The second number is "+ array01[1]);
		System.out.println("The last number is "+ array01[4]);
		
		System.out.println("The last number is (hardcoded) " + array01[array01.length -1]);
		
		
		String[] array02 = {"abc","pqr","xyz"};
		String str01 ="Clean World Green World";
		String[] array03 = str01.split(" "); // first word followed by space
		System.out.println("The first word is "+ array03[0]);
		System.out.println("The last number is (hardcoded) " + array03[array03.length -1]);
		
	}

}
