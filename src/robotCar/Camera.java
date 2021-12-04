package robotCar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Camera extends Sensors implements SelfCheckCapable {
	private static int resolutionX = 1920;
	private static int resolutionY = 1080;
	private static boolean faceRecognized = false;
	private static boolean sensorInitialized = false;

	public Camera() {
		runSelfCheck();
	}
	
	protected void initializeSensor()
	{
		sensorInitialized = true;
		System.out.println("Camera Initialized");

	}
	
	public static void scanEnvironment()
	{
		if (faceRecognized = false)
		{
			faceRecognition(faceRecognized);
		}
	}
	
	public static boolean faceRecognition(boolean faceRecognized)
	{
		return faceRecognized = true;
	}
	
	private static void takePhoto()
	{
		
	}
	
	private static void takeVideo()
	{
		
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}

}
