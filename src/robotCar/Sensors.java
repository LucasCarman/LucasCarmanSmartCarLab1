package robotCar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public abstract class Sensors implements SelfCheckCapable{
	private static int sensorNumber = 3;
	private static String [] sensorType = {"LineTrack, Camera, UltraSonic"};

	protected abstract void initializeSensor();

	public Sensors() {

	}

}