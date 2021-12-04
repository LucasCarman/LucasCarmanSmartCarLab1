package robotCar;

import edu.fiu.sysdesign.SelfCheckUtils;
import edu.fiu.sysdesign.SelfCheckCapable;


public class LineTrack extends Sensors implements SelfCheckCapable {
	private static boolean sensorInitialized = false;
	private static boolean lineTracked = false;
	
	public LineTrack()
	{
		runSelfCheck();
	};
	
	public static void trackLine()
	{
		lineTracked = true;
		System.out.println("I am tracking a line");
	}
	
	public void initializeSensor()
	{
		sensorInitialized = true;
		System.out.println("Line Tracker Initialized");
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "LineTrack";
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
	

}
