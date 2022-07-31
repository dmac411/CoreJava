package test;

public class VowelsSwitchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Switch Example using Switch Case
		// use break to stop processing once you make the match
		
		
				String str01 = "Clean World Green World";
					int count = 0;
				
				for(int index = 0;index<str01.length();index++) {
					char ch = str01.charAt(index);
				
					switch(ch) {
					
					case 'a':
						count++;
						break;  
					case 'e':
						count++;
						break;
					case 'i':
						count++;
						break;
					case 'o':
						count++;
						break;
					case 'u':
						count++;
						break;
				}
			}
				System.out.println("The vowel count is " + count);
		}
	}

