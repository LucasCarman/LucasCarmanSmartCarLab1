package robotCar;

public class LineTrack extends Sensors {
	private static boolean sensorInitialized = false;
	private static boolean lineTracked = false;
	
	public static void trackLine()
	{
		lineTracked = true;
		System.out.println("I am tracking a line");
	}
	
	public void initializeSensor()
	{
		sensorInitialized = true;
		System.out.println("Line Tracker Initialized");
	}
	

}
