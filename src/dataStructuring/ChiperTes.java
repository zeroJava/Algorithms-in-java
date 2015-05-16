package dataStructuring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChiperTes {
	
	int number;
	
	@Before
	public void startup()
	{
		number = 1101;	
	}

	@Test
	public void test()
	{
		System.out.println(Cipherin.deChipherNumber(number));
	}

}
