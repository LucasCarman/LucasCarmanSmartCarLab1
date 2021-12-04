package robotCar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Communications implements SelfCheckCapable {
	private static String communicationDevice = "Bluetooth";
	private static boolean communicationInitialized = false;
	
	public Communications() {
		runSelfCheck();
	}
	
	public void initializeCommunication()
	{
		communicationInitialized = true;
		System.out.println("Communications Initialized");

	}
	
	
	public static void receiveComms()
	{
		
	}
	
	public static void sendComms()
	{
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Communication Module";
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
