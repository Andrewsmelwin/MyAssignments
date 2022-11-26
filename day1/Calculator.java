package week1.day1;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public double sub(double a, double b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public double mul(int a, double b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public double div(int a, double b) {
		return a/b;
	}

	public static void main(String[] args) {
		
		Calculator cal= new Calculator();
		
		System.out.println(cal.add(10,20));
		System.out.println(cal.add(10.5,20.5));
		System.out.println(cal.sub(10, 5));
		System.out.println(cal.sub(4.5, 2.5));
		System.out.println(cal.mul(5, 2));
		System.out.println(cal.mul(5, 2.5));
		System.out.println(cal.div(10, 2));
		System.out.println(cal.div(10,2.5));

	}

}
