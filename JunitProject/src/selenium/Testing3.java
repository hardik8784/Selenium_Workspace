package selenium;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Testing3 {
	
	@Rule
	public ErrorCollector err = new ErrorCollector();

	@Test
	public void test6() {
		String expected = "abc";
		String actual = "abc1";
		
		/*if(expected.equals(actual))
		{
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		}*/
		System.out.println("Before Assert");
		Assert.assertEquals(expected, actual);		//Hard assert - industry usage
		System.out.println("after first Assert");
		Assert.assertTrue("2>3 or not", 2>3);
		System.out.println("after second Assert");
	}
	
	@Test
	public void test7() {
		String expected = "abc";
		String actual = "abc1";
		
		/*if(expected.equals(actual))
		{
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		}*/
		System.out.println("Before Assert");
		try {
		Assert.assertEquals(expected, actual);		//Hard assert - industry usage
		}catch(Throwable t){
			System.out.println("I am in first catch");
			err.addError(t);
		}
		System.out.println("after first Assert");
		try {
			Assert.assertTrue("2>3 or not", 2>3);	
		}catch(Throwable t)
		{
			System.out.println("I am in second catch");
			err.addError(t);
		}
		System.out.println("after second Assert");
	}


}
