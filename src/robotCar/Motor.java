package robotCar;

public class Motor extends TransmissionComponent {

	private static float speedMax = 1f;
	private static float driveImpulseLevel = 0f;
	private static boolean transmissionInitialized = false;
	
	public static boolean initializeTransmission()
	{
		return transmissionInitialized = true;
	}
	
	private static void driveImpulse()
	{
		driveImpulseLevel = 1f;
	}
}
