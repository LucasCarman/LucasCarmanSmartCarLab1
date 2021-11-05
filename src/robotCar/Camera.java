package robotCar;

public class Camera extends Sensors {
	private static int resolutionX = 1920;
	private static int resolutionY = 1080;
	private static boolean faceRecognized = false;
	private static boolean sensorInitialized = false;

	public static void initializeSensor()
	{
		sensorInitialized = true;
	}
	
	public static void scanEnvironment()
	{
		if (faceRecognized = false)
		{
			faceRecognition(faceRecognized);
		}
	}
	
	public static boolean faceRecognition(boolean faceRecognized)
	{
		return faceRecognized = true;
	}

}
