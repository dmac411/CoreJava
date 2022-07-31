package Collections;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Clean World Green World Love World";

		// split string at every space in the string
		// to get all the words in the string
		String[] words = str1.split(" ");

		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
//this will check word 1st time is null then increment by 1 then if word
		// again then add 1 to existing value 
		for (String word : words) {
			if (map1.get(word) == null) {

				map1.put(word, 1);
			}else {
				int oldOccurence = map1.get(word);
				map1.put(word, oldOccurence+1);
		}
			}

		System.out.println(map1);

	}

}
