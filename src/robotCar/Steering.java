package robotCar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Steering extends TransmissionComponent implements SelfCheckCapable{
	
	private float steerMax = 1f;
	private float steerMin = 1f;
	private float steerLevel = 0;
	private static boolean transmissionInitialized = false;
	
	public Steering() {
		runSelfCheck();
	}
	
	protected void initializeTransmission()
	{}
	
	public static void steer()
	{
	
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Steering";
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
