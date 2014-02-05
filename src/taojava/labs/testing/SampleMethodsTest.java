package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleMethodsTest {

	@Test
	public void testRemoveAs() {
		  assertEquals("empty string", "", "");
		  assertEquals("no as", "hello", "hello");
		  assertEquals("eliminate one a", "", SampleMethods.removeAs("a"));
		  assertEquals("eliminate many as", "", SampleMethods.removeAs("aaaa"));
		  assertEquals("eliminate one a, short string", "pin", 
		               SampleMethods.removeAs("pain"));
		  assertEquals("eliminate many as, medium string", "lphbet", 
		               SampleMethods.removeAs("alphabet"));
		  assertEquals("eliminate many as, silly string", "BCDEFGHIJKLMNOPQ",
		               SampleMethods.removeAs("aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa"));
		  assertEquals("eliminate prefix and suffix as", "bbb",
		               SampleMethods.removeAs("aaabbbaaa"));
		} // testRemoveAs

}
