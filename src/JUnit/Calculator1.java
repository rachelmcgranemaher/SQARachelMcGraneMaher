package JUnit;

public class Calculator1 {
	private int a;
	private int b;
	
	public Calculator1() {}
	
	public Calculator1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int add() {
		return a+b;
	}
	
	public int subtract() {
		return a-b;
	}
	
	public int multiply() {
		return a*b;
	}
	
	public int divide() {
		return a/b;
	}

}
