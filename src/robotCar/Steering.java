package robotCar;

public class Steering extends TransmissionComponent {
	
	private float steerMax = 1f;
	private float steerMin = 1f;
	private float steerLevel = 0;
	private static boolean transmissionInitialized = false;
	
	public static boolean initializeTransmission()
	{
		return transmissionInitialized = true;
	}
	
	public static void steer()
	{
	
	}


}
