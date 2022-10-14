package tests;

public class DataTypesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int
		int i=10;
		System.out.println("i" + " = " + i );	//10
		i=20;
		System.out.println("i" + " = " + i );	//20
		i = i + 10;
		System.out.println("i" + " = " + i );	//30
		i = i * 2;
		System.out.println("i" + " = " + i );	//60
		System.out.println("i" + " = " + (i*2) ); //120
		System.out.println("i" + " = " + i );	//60
		
		System.out.println("i" + " Post Increment " + i++ );	//post increment
		//System.out.println("Post Increment Value" + " = " + i );
		System.out.println("After Post Increment Value of i is : " + i );
		System.out.println("i" + " Pre Increment " + ++i );	//Pre increment
		System.out.println("i" + " = " + i );	//62
		
		//double
		double d=11.12;
		System.out.println("d" + " = " + d);
		System.out.println("d*2" + " = " + (d*2));
		System.out.println("d" + " = " + d);
		
		//char
		char c ='b';
		System.out.println("c" + " = " + c);
		char e ='8';
		System.out.println("e" + " = " + e);
		
		//boolean
		boolean b = true;
		System.out.println("b" + " = " + b);
		b = false;
		System.out.println("b" + " = " + b);
	}

}
