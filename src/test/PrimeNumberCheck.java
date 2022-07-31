package test;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// use a for loop and start from 2

		int num01 = 13;
		boolean flag = true;

		for (int index = 2; index < num01; index++) {
			int remainder = num01 % index;
			if (remainder == 0) {
				System.out.println("Number is not Prime");
				flag = false;
				break;
			}
		}
		if (flag==true) {
			System.out.println("Number is Prime");
		}
	}
}