package gittest;

public class main {

	public static void main(String[] args) {
		
		System.out.println("init");
		System.out.println("init2");
		
	}
	
	public int plus(int a , int b) {
		System.out.println(a+b);
		int p = a+b;
		return p;
	}
	
	public int minus(int a , int b) {
		System.out.println(a-b);
		int m = a-b;
		return m;
	}
	
	public int test(int a , int b) {
		int result = a*b;
		return result;
	}
	
	public double test2(int a , int b) {
		double result = (double)a/b;
		return result;
	}
	

}
