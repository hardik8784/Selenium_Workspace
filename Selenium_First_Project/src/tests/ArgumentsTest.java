package tests;

public class ArgumentsTest {

	static ArgumentsTest a = new ArgumentsTest();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(4,5);
		sum(10,90);
		sum(10,20);
		sum(1,5,4);
		sum();
	}
	
	public static void sum() {
		int x = 1 + 4 ;
		System.out.println("Sum for the numbers is : " + x);
	}
	
	public static void sum(int a,int b) {
		int x = a + b;
		System.out.println("Sum for the numbers " + a + " & " + b + " is : " + x);
	}
	
	public static void sum(int a,int b,int c) {
		int x = a + b + c;
		System.out.println("Sum for the numbers " + a + "," + b + " & " + c + " is : " + x);
	}
	
	/*public void sum1(int a,int b) {
		int x = a+b;
		System.out.println("Sum for the numbers " + a + " & " + b + " is : " + x);
	}*/
	
}
