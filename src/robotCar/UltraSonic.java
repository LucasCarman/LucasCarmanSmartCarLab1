package robotCar;

public class UltraSonic extends Sensors {
	private static boolean sensorInitialized = false;
	private static float measuredDistance = 0f;
	
	protected void initializeSensor()
	{
		sensorInitialized = true;
		System.out.println("Ultra Sonic Initialized");

	}
	
	public static float testDistance()
	{
		return measuredDistance = 1f;
	}


}
