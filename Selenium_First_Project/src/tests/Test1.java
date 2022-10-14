package tests;

import selenium.Test4;

public class Test1 {
	
	//ClassName objName = new ClassName;
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	//static ArgumentsTest a = new ArgumentsTest();
	
	public static void main(String[] args) {
		//Test1 t1 = new Test1();			//It's using in just main method so we can do this as well if want to.
		scanMe();	//This calls first as Java execute line by line
		printMe();	//This calls second as Java execute line by line
		t1.paintMe();
		t1.testMe();
		
		/*
		 * Static - No Object
		 * -ClassName.methodName();
		 * -methodName(); -only when you call in same class
		 */
		Test2.circle();		//Static in different class
		
		/*
		 * Non Static - Object
		 * -objectname.methodName();
		 * */
		t2.square();
		
		Test3.blue();
		//t3.red();
		Test3.t3.red();
		Test4.bmw();
		//t4.audi();
		Test4.t4.audi();		//To access the object should be public not private or protected
		ArgumentsTest.sum(100, 200);
		//ArgumentsTest.a.sum1(1, 5);
	}
	
	public static void printMe()
	{
		System.out.println("I want to Print");
		//System.out.println("After printMe");
	}
	
	public static void scanMe()
	{
		System.out.println("I want to scan");
	}
	
	public void paintMe()
	{
		System.out.println("I want to paint");
	}
	
	public void testMe()
	{
		System.out.println("I want to Test");
	}
}
