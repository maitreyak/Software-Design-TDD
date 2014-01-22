package providers;

import com.provider1.TemperatureProvider;

public class Provider1 implements ServiceProvider{
    TemperatureProvider provider;
	
    public Provider1(){
    	provider = new com.provider1.TemperatureProvider();
	}
	
    public int getTemperature(int cityID) throws RuntimeException{
		return provider.getTemperature(cityID);
    }
    
    public String getProviderName(){
    	return "Provider1";
    }
		
	
	}


