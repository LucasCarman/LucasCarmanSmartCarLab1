package robotCar;

public class Motor extends TransmissionComponent {

	private static float speedMax = 1f;
	private static float driveImpulseLevel = 0f;
	private static boolean transmissionInitialized = false;
	
	public void initializeTransmission()
	{
		transmissionInitialized = true;
		System.out.println("Motor Initialized");

	}
	
	private static void driveImpulse()
	{
		driveImpulseLevel = 1f;
	}
}
