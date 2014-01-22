package temperature;

import junit.framework.TestCase;

public class TestTemperatureClient extends TestCase{
	
	TemperatureClient _providers;
	
	public void setUp(){
		_providers = new TemperatureClient();
	}
	
	public void testCreateRegisteredProviders(){
		assertNotNull(_providers);
	}
		
	public void testGetNumberofProviders(){
		assertEquals(3, _providers.getNumberofProviders());		
	}
	
}
