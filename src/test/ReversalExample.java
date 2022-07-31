package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reverse the string
		// use for loop

		String str01 = "Clean World Green World";
		String result = ""; // initialize result

		// this starts at last char of string -1 and goes to begin of string -0
		for (int index = str01.length() - 1; index >= 0; index--) {
			char ch = str01.charAt(index);
			result = result + ch; // adds each char read in reverse to result
		}
		System.out.println("The result is " + result);

		int num = 456789;
		// divide by 10
		int result1 = 0;
		while (num > 0) {
			int remainder = num % 10; // 9
			result1 = result1 * 10 + remainder; // divide by 10 then add the remainder 9876
			num = num / 10;
		}
		System.out.println("The result num is " + result1);
	}
}
