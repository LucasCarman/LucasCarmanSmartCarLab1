package robotCar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Motor extends TransmissionComponent implements SelfCheckCapable {

	private static float speedMax = 1f;
	private static float driveImpulseLevel = 0f;
	private static boolean transmissionInitialized = false;
	
	public Motor() {
		runSelfCheck();
	}
	
	public void initializeTransmission()
	{}
	
	private static void driveImpulse()
	{
		driveImpulseLevel = 1f;
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Motor";
	}


	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}


	@Override
	public boolean runSelfCheck() {
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
}
