package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// hash map key-value integer=key string=value
		
		HashMap<Integer,String> map1 = new HashMap<Integer, String>();
		
		map1.put(1,"Matt");
		map1.put(2,"Kate");
		map1.put(3,"John");
		map1.put(4,"Kathy");
		map1.put(5,"Matt");
		// replace value in position 2
		map1.put(2,"Arpita");
		map1.put(100,"Sanchin");
		
		System.out.println(map1);
		System.out.println("Data at 4th key is " + map1.get(4));
		System.out.println("Data at 100th key is " + map1.get(100));
		
		// remove key 100
		
		map1.remove(100);
		System.out.println("key 100 is removed from list" + map1);
		
		//get key set first
		// get value of key
		for(Integer key: map1.keySet()) {
			
			System.out.println("Key is : " + key +" Value is : " +map1.get(key));
			//System.out.println("Value is : "+ map1.get(key));
		}
		
	}

}
