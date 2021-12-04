package robotCar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public abstract class TransmissionComponent implements SelfCheckCapable {
	private static int tComponentNumber = 2;
	public static boolean transmissionInitialized = false;
	

	abstract void initializeTransmission();
	
}