package providers;

import com.provider2.TemperatureFinder;

public class Provider2 implements ServiceProvider{

    TemperatureFinder temperature;
    
    public Provider2(){
    	
    	temperature = new com.provider2.TemperatureFinder();
    }
	
    public int getTemperature(int cityID) throws RuntimeException{
		
    	return temperature.findTemperature(cityID);
	}

    public String getProviderName(){
    	return "Provider2";
    }
}
