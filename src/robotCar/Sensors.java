package robotCar;

public abstract class Sensors {
	private static int sensorNumber = 3;
	private static String [] sensorType = {"LineTrack, Camera, UltraSonic"};

	abstract void initializeSensor();
	
}
