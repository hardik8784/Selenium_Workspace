package tests;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_name = "Hardik";
		System.out.println(first_name);
		
		String last_name = "Shah";
		System.out.println(last_name);
		
		String space = " ";
		
		System.out.println(first_name + last_name);		//Add two String
		System.out.println(first_name + " " + last_name);	//Make a space in between
		System.out.println(first_name + space + last_name);	//Made a variable for the space and use the same
		
		int a = 10;				
		int b = 20;
		
		System.out.println(first_name + last_name + a + b);		//String will join same as a character
		System.out.println(a + b+first_name + last_name);		//First perform int addition and then join the string
		System.out.println(first_name + last_name + (a + b));	//Parenthesis operate first and join the string
		System.out.println(first_name + last_name + (a * b));	//Parenthesis operate first and join the string
		System.out.println(first_name + last_name + (a / b));	//Parenthesis operate first and join the string
	}

}
