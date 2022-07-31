package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num01 = 2; // loop thru 10

		while (num01 <= 10) {

			if (num01 == 6) {
				num01 = num01 + 2;
				continue; // use break
			}

			System.out.println(num01);
			num01 = num01 + 2; // or num01++ - incremental operation
		}
		System.out.println("After the while loop");

		// for loop
		for (int index = 1; index <= 10; index++) {
			if (index == 6) {
				continue;
			}
			System.out.println(index);
		}

		// for each loop use only with arrays or list
		System.out.println("After the for loop");
		int[] array01 = { 10, 20, 30, 40, 50 };
		for (int num2 : array01) {
			System.out.println(num2);

		}
		System.out.println("After the for each loop");

		// Write the logic to print all the array values using normal for loop

		for(int index=0;index<array01.length;index++) {
					
					System.out.println(array01[index]);
				}
   // while loop for reversing array
        
    //    index = 1;
    //    while (array01.length-index >= 0) {
    //        System.out.println(array01[array01.length-index]);
   //         index++;
          
    //    }
	}
}
