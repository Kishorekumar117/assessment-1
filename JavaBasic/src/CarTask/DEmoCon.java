package CarTask;

public class DEmoCon {
	private String door;
	private String engine;
	private String driver;
	private int speed;
	
	public DEmoCon(){
		door="closed";
		engine="on";
		driver="seated";
		speed=50;
	}

	public DEmoCon(String door, String engine, String driver, int speed) {
		super();
		this.door = door;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	public String run() {
		if(door.equals("closed") && engine.equals("on")&&driver.equals("seated")&&speed>0) {
			return "car is running";
		}
		else {
			return "car is not runnning";
		}
	}
}
