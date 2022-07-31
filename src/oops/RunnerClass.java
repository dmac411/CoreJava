package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee Emp01 = new Employee();

		Emp01.Name = "Dominic";
		Emp01.EmpId = 1000;
		Emp01.Department = "Engineering";

		// System.out.println(Emp01.Name);
		// System.out.println(Emp01.EmpId);
		// System.out.println(Emp01.Department);
		Emp01.Display(); // this is from function in the Employee package

		// this is a constructor will initialize value of the object
		Employee Emp02 = new Employee("Jack", 1001, "Finance");
		Emp02.Display();

		// Emp02.Name = "Krystyna";
		// Emp02.EmpId = 1001;
		// Emp02.Department = "Medical";
		// Emp02.Display(); // this is from function in the Employee package

		Bank B = new Bank();
		B.DisplayBalance();

		int Bal = B.GetBalance();
		System.out.println("The Balance is " + Bal);
		System.out.println("The Balance is " + B.GetBalance());

		BOABank B1 = new BOABank();
		B1.CCBalance();
		B1.DisplayBalance();

		OverloadingExample obj = new OverloadingExample();
		int RectangleArea = obj.GetArea(3, 4);
		int SquareArea = obj.GetArea(4);

		System.out.println("The RectangleArea " + RectangleArea);
		System.out.println("The SquareArea " + SquareArea);

		B1.CloseAccount(123456);

		Chrome Ch = new Chrome();
		Ch.OpenBrowser();
		Ch.CloseBrowser();
		Ch.Show();

		// use parent class name
		Browser Br = new Chrome();
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.DisplayName();
		
		// interface example
		HondaCar car1 = new HondaCar();
		CarInterface car2 = new HondaCar();
		
		// encapsulation example
		
		EncapsulationExample En = new EncapsulationExample();
		En.setBalance(3000);
		System.out.println(En.getBalance());
	}

}
