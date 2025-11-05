package week09.raffi.id.umn.ac;

public class Smartphone extends Device implements Power, VolumeControl, Device.Connectivity {
	private int currentVolume;
	private String connectedNetwork;
	
	public Smartphone(String brand, String model) {
		super(brand,model);
		this.currentVolume=currentVolume;
		this.connectedNetwork=connectedNetwork;
	}

	@Override
	public void connectToWiFi(String networkName) {
		connectedNetwork = networkName;
        System.out.println("Connecting to WiFi: " + connectedNetwork);
		
	}

	@Override
	public void disconnectFromWiFi() {
		 System.out.println("Disconnecting from WiFi...");
	     connectedNetwork = "None";
		
	}

	@Override
	public void increaseVolume(int level) {
		 currentVolume += level;
	        System.out.println("Increasing volume by " + level + " levels.");
		
	}

	@Override
	public void decreaseVolume(int level) {
		 currentVolume -= level;
	      if (currentVolume < 0) currentVolume = 0;
	      System.out.println("Decreasing volume by " + level + " levels.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Turning on the device...");
		
	}

	@Override
	public void turnOf() {
		System.out.println("Turning off the device...");
		
	}
	
}