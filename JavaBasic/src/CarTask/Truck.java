package CarTask;

public class Truck extends Vehicle{
	private String steering;
	private String MusicSystem;
	private String container;
	
	
	
	public Truck(String engine, int wheels, int seats, int fuelTank, String lights, String abs,String steering,String MusicSystem,String container) {
		super(engine,wheels,seats,fuelTank,lights,abs);
		this.steering=steering;
		this.MusicSystem=MusicSystem;
		this.container=container;
	}

	public String getSteering() {
		return steering;
	}
	
	public String getMusicSystem() {
		return MusicSystem;
	}
	
	public String getContainer() {
		return container;
	}
	
	
	
}
