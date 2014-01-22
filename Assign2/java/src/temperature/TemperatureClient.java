package temperature;

import java.util.ArrayList;

import providers.Provider1;
import providers.Provider2;
import providers.Provider3;
import providers.ServiceProvider;

public class TemperatureClient {

	private ArrayList<ServiceProvider> providerList;
	
	public TemperatureClient(){
		providerList = new ArrayList<ServiceProvider>();
		populateProvidersList();
	}
	public int getNumberofProviders(){
		return providerList.size();
	}
	
	private void populateProvidersList(){
		providerList.add(new Provider1());
		providerList.add(new Provider2());
		providerList.add(new Provider3());
	}
	
	public String findTemperature(int cityID){
		TemperatureFinder temperatureFinder = new TemperatureFinder();
		return temperatureFinder.fetchTemperature(cityID, providerList);
	}
}
