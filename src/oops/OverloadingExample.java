package oops;

public class OverloadingExample {
	
	//compile time / overloading polymorphism
	
	public int GetArea(int l, int b) {
		return l*b;
	}
	
	public int GetArea(int l) {
		return l*l;
	}
	public float GetArea(float r) {
		
		return r = (r*r);
	}
}
