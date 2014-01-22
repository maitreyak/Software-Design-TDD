package temperature;

import java.util.ArrayList;
import providers.ServiceProvider;

public class TemperatureFinder {

	public String fetchTemperature(int cityID, ArrayList<ServiceProvider> providers) throws RuntimeException{
		
		int temperature = 0;
		String providerName = null;
		
		for(ServiceProvider serviceProvider : providers){
			
			try{
				temperature = getTemperatureFromTheProvider(cityID, serviceProvider);
				providerName = serviceProvider.getProviderName();
			}
			catch(RuntimeException ex){
				continue;
			}
			break;
		}
		if(providerName == null)
			return null;
		return String.format("Temperature (as reported by %s) is %d", providerName, temperature);
	}
	
	public int getTemperatureFromTheProvider(int cityID, ServiceProvider provider) throws RuntimeException{
		return provider.getTemperature(cityID);
	}
	
}
