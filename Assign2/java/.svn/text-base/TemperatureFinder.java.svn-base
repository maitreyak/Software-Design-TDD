public class TemperatureFinder {
  public String fetchTemperature(int cityID) {
    int temperature = 0;
    boolean success = false;
    String provider = null;

    //First find temperature from the cheap provider.
    try {
      temperature = new com.provider1.TemperatureProvider().getTemperature(cityID);      
      provider = "Provider1";
      success = true;
    } catch(RuntimeException ex) {
      //Time to try another service      
    }
    
    if (!success) {
      //Let's try a provider who charges now.
      try {
        temperature = new com.provider2.TemperatureFinder().findTemperature(cityID);      
        provider = "Provider2";
        success = true;
      } catch(RuntimeException ex) {
        //Time to try another service      
      }      
    }
    
    if (!success) {
      //OK, it's time to use the service that is available.
      try {
        temperature = new com.provider3.QueryTemperature().queryForTemperature(cityID);      
        provider = "Provider3";
        success = true;
      } catch(RuntimeException ex) {
        //Time to try another service      
      }      
    }
    
    return String.format("Temperature (as reported by %s) is %d", provider, temperature);
  }
}