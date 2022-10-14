package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList<String> names = new ArrayList<String>();
		
		
		names.add("ha");
		names.add("rd");
		names.add("ik");
		names.add("sh");
		names.add("ah");
		
		System.out.println("Array List size : " + names.size());
		
		System.out.println("Getting the first element  : " + names.get(0));
		System.out.println("Getting the Second element : " + names.get(1));
		System.out.println("Getting the Third element  : " + names.get(2));
		System.out.println("Getting the forth element  : " + names.get(3));
		System.out.println("Getting the fifth element  : " + names.get(4));
		
		System.out.println("----------------------------------------");
		
		names.remove(2);
		System.out.println("New Array List size : " + names.size());
		
		System.out.println("New second position : " + names.get(2));
		
		System.out.println("----------------------------------------");
		
		names.add("ik");
		System.out.println("New Array List size : " + names.size());
		
		for(int i=0 ; i < names.size() ; i++)
		{ 
			System.out.println("Element " + i + " : " +names.get(i));
		}
		
	}

}
