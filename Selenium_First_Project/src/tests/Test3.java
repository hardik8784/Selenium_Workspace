package tests;

public class Test3 {
	static Test1 t1 = new Test1();
	static Test3 t3 = new Test3();
	
	public static void main(String[] args) {
		blue();
		t3.red();
		Test1.printMe();
		//t1.paintMe();
		Test1.t1.paintMe();
	}

	public static void blue()
	{
		System.out.println("I am blue ");
	}
	
	public void red()
	{
		System.out.println("I am red");
	}
}
