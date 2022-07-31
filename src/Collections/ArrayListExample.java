package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// typical way of doing array
		String[] array1 = { "abc", "pqr", "xyz" };

		// this is how to create an array list
		ArrayList<String> list1 = new ArrayList<String>();
		// this is an index with 5
		list1.add("John");
		list1.add("Leeana");
		list1.add("Priyanka");
		list1.add("Rohan");
		list1.add("Laurence");

		System.out.println("List is this " + list1);
		System.out.println("Size of List is " + list1.size());

		// this will remove index number start at 0,1,2..
		list1.remove(1);
		System.out.println("List is this " + list1);
		System.out.println("Size of List is " + list1.size());

		// print data in 4th position
		System.out.println("Data at 4th position " + list1.get(3));

		// replace john in 1st position with james
		list1.set(0, "James");
		System.out.println("List is this after replacing John " + list1);

		// add leeana after removing above to 2nd position in list
		list1.add(1, "Leeana");
		System.out.println("List is this after adding leeana " + list1);

		// sort the data
		Collections.sort(list1);
		System.out.println("List is this after collection.sort " + list1);

		// how to traverse using for loop

		for (int index = 0; index < list1.size(); index++) {

		//	System.out.println("the position for priyanka");

			System.out.println(list1.get(index));
		}
		for (String name : list1) {
			//System.out.println("the position for priyanka");

			System.out.println(name);
		}
		// what is the location of Priyanka
		for (int index = 0; index < list1.size(); index++) {
			if (list1.get(index).equals("Priyanka")) {
				System.out.println(index);
				break;
			}

		}
	}

}
