package tests;

public class ArrayTest {

	public static void main(String[] args) {

		String name="Hardik";
		System.out.println(name);
		
		/*String name1 = "Ha";
		String name2 = "rd";
		String name3 = "ik";*/
		
		String names[] = {"Ha","rd","ik"};
		System.out.println("Length of the Array names[] is : " + names.length);
		
		
		int numbers[] = {1,2,3,4,5};
		System.out.println("Length of the Array numbers[] is : " + numbers.length);
		/*System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		System.out.println("----------------------");
		System.out.print(names[0]);
		System.out.print(names[1]);
		System.out.print(names[2]);*/
		
		System.out.println("----------Print the same by using for loop----------");
		
		for(int i = 0 ; i < names.length ; i++)
		{
			System.out.println(names[i]);
		}
		
		System.out.println("----------Don't put in new line now----------");
		
		for(int i = 0 ; i < names.length ; i++)
		{
			System.out.print(names[i]);
		}
		System.out.println();
		System.out.println("----------Use the Numbers for the same now----------");
		
		for(int i = 0 ; i <numbers.length ;i++)
		{
			System.out.println(numbers[i]);
		}
		
		
		System.out.println("----------Mix Array----------");
		
		Object mix[] = {"Ha",1,"rd",2,3,4,"ik",5};
		System.out.println("Length of the Array mix[] is : " + mix.length);
		
		for(int i = 0 ; i <mix.length ;i++)
		{
			System.out.println(mix[i]);
		}
	}

}
