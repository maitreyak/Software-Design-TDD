package providers;

import com.provider3.QueryTemperature;

public class Provider3 implements ServiceProvider{
     
	QueryTemperature temperature;
    
	public Provider3(){
		temperature = new com.provider3.QueryTemperature();
      }
	
	 public int getTemperature(int cityID) throws RuntimeException {
		
		return temperature.queryForTemperature(cityID);
	}
	 
	 public String getProviderName(){
	    	return "Provider3";
	    }

}
