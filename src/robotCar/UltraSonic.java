package robotCar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class UltraSonic extends Sensors implements SelfCheckCapable{
	private static boolean sensorInitialized = false;
	private static float measuredDistance = 0f;
	
	
	
	public UltraSonic() {
		runSelfCheck();
	}
	
	public static float testDistance()
	{
		return measuredDistance = 1f;
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "UltraSonic";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);

	}

	@Override
	protected void initializeSensor() {
		// TODO Auto-generated method stub
		
	}


}
