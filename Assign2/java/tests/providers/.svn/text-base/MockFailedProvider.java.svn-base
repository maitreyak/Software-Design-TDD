package providers;

import providers.ServiceProvider;

public class MockFailedProvider implements ServiceProvider{

	public String getProviderName() {
		return "Mock failed provider";
	}

	public int getTemperature(int cityID) {
		throw new RuntimeException();
	}

}
