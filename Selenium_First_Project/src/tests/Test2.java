package tests;

public class Test2 {
	/*Methods can be only accessible into main method
	 */
	//Name is same as classname and no return type so it's called constructor
	public Test2() {
		System.out.println("I am a constructor_Test2");
	}
	
	public static void circle()
	{
		System.out.println("I am circle ");
	}
	
	public void square()
	{
		System.out.println("I am square");
	}

}
