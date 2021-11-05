package robotCar;

public abstract class TransmissionComponent {
	private static int tComponentNumber = 2;
	public static boolean transmissionInitialized = false;
	

	abstract void initializeTransmission();
}