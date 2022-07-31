package test;

public class VowelsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the vowels of the string
		// Iterate thru each string and verify each character for aeiou
		// Use a for loop and use an index

		String str01 = "Clean World Green World";
		int count = 0;
		str01 = str01.toLowerCase();
		
		for(int index = 0;index<str01.length();index++) {
			char ch = str01.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				count++;
			}

		}
		System.out.println("The vowel count is " + count);
	}
}
