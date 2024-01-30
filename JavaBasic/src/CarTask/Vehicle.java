package CarTask;

public class Vehicle {
	public String engine;
	public int wheels;
	public int seats;
	public int fuelTank;
	public String lights;
	public String abs;

	public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights, String abs) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
		this.abs = abs;
	}

	public String getEngine() {
		return engine;
	}


	public int getWheels() {
		return wheels;
	}


	public int getSeats() {
		return seats;
	}


	public int getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}


	public String getAbs() {
		return abs;
	}

	
	
	
}
