package test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num01 = 30;
		int num02 = 20;
		int sum = num01 + num02;
		int multiplication = num01 * num02;
		float division = (float) num01 / num02;
		System.out.println(sum);
		System.out.println("The sum of two numbers is " + sum);
		System.out.println("The multiplicatoin of two numbers is " + multiplication);
		System.out.println("The division of two numbers is " + division);
		
		String str01 = "Clean World Green World";
		System.out.println(str01);

		char char01 = str01.charAt(0);
		System.out.println("The first character is " + char01); 
		System.out.println("The length of the string is " + str01.length());
		
		char lastChar = str01.charAt(str01.length() -1);
		System.out.println("The last character is " + lastChar);
		System.out.println("The string in upper case is " + str01.toUpperCase()); 
		System.out.println("The string in upper case is " + str01.toLowerCase()); 
	}
}
