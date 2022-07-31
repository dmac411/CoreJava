package test;

public class PatternsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print * from one to five 1 star, 2 star, 3 star 
		
		for (int i=1;i<=5;i++) {
			int j = 1;
			
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
		
	}

}
