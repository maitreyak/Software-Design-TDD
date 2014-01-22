package temperature;

import java.util.ArrayList;

import providers.MockFailedProvider;
import providers.MockSuccessfulProvider;
import providers.ServiceProvider;

import junit.framework.TestCase;

public class TestTemperatureFinder extends TestCase{

	TemperatureFinder temperatureFinder;
	
	public void testCanary(){
		assertTrue(true);
	}
	
	public void setUp(){
		temperatureFinder = new TemperatureFinder();
	}
	
	public void testGetTemperatureFromTheProvider(){
		ServiceProvider serviceProvider = new MockSuccessfulProvider();
		assertEquals(100,temperatureFinder.getTemperatureFromTheProvider(100,serviceProvider));
	
	}
	
	public void testGetTemperatureFromTheProviderException(){
		ServiceProvider serviceProvider = new MockFailedProvider();
		try{
			temperatureFinder.getTemperatureFromTheProvider(100,serviceProvider);
			fail("Runtime Exception was supposed to occur");
		}
		catch(RuntimeException ex){
			
		}	
	}
	
	public void testFetchTemperatureFirstProviderPassed(){
		
		ArrayList<ServiceProvider> serviceProviderList = new ArrayList<ServiceProvider>();
		serviceProviderList.add(new MockSuccessfulProvider());
		serviceProviderList.add(new MockFailedProvider());
		String temperatureString = temperatureFinder.fetchTemperature(100,serviceProviderList);
		assertEquals("Temperature (as reported by SuccessfulProvider) is 100", temperatureString);
	}
	
	public void testFetchTemperatureSecondProviderPassed(){
		
		ArrayList<ServiceProvider> serviceProviderList = new ArrayList<ServiceProvider>();
		serviceProviderList.add(new MockFailedProvider());
		serviceProviderList.add(new MockSuccessfulProvider());
		String temperatureString = temperatureFinder.fetchTemperature(100,serviceProviderList);
		assertEquals("Temperature (as reported by SuccessfulProvider) is 100", temperatureString);
	}
	
	public void testFetchTemperatureAllProvidersFailed(){
		ArrayList<ServiceProvider> serviceProviderList = new ArrayList<ServiceProvider>();
		serviceProviderList.add(new MockFailedProvider());
		serviceProviderList.add(new MockFailedProvider());
		String temperatureString = temperatureFinder.fetchTemperature(100,serviceProviderList);
		assertEquals(null, temperatureString);
	}
	
}
