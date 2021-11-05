package robotCar;

public class RobotCar {
	private static int sizeX;
	private static int sizeY;
	private static int sizeZ;
	private static String model;
	private static String color;
	private static boolean componentCheck = false;
	private static String [] modeType = {"Automatic, Line Track"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LineTrack.initializeSensor();
		Camera.initializeSensor();
		UltraSonic.initializeSensor();
		Steering.initializeTransmission();
		Motor.initializeTransmission();
		testComponents();
		
		if (componentCheck)
		{
			System.out.println("We Did It!");
		}

	}
	private static void testComponents()
	{
		componentCheck = true;
	}

	private static void modeSelection()
	{
		
	}
}
