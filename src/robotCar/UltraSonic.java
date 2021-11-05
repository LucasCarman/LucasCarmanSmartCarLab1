package robotCar;

public class UltraSonic extends Sensors {
	private static boolean sensorInitialized = false;
	private static float measuredDistance = 0f;
	
	public static void initializeSensor()
	{
		sensorInitialized = true;
	}
	
	public static float testDistance()
	{
		return measuredDistance = 1f;
	}


}
