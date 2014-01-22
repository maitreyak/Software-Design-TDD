package providers;

import junit.framework.TestCase;

public class TestProvider extends TestCase{

	MockSuccessfulProvider provider;
	
	public void setUp(){
		provider = new MockSuccessfulProvider();
	}
	
	public void testGetProviderName(){
		assertEquals("SuccessfulProvider", provider.getProviderName());
	}
}
