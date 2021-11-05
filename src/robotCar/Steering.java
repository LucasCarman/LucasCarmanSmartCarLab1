package robotCar;

public class Steering extends TransmissionComponent {
	
	private float steerMax = 1f;
	private float steerMin = 1f;
	private float steerLevel = 0;
	private static boolean transmissionInitialized = false;
	
	protected void initializeTransmission()
	{
		transmissionInitialized = true;
		System.out.println("Steering Initialized");

	}
	
	public static void steer()
	{
	
	}


}
