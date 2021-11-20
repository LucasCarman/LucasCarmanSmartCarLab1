package robotCar;

import java.util.Scanner;

import edu.fiu.sysdesign.SelfCheckUtils;

public class Execution {
	
	private static boolean componentCheck = false;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LineTrack lineTrack = new LineTrack();
		lineTrack.initializeSensor();
		
		Camera camera = new Camera();
		camera.initializeSensor();
		
		UltraSonic ultraSonic = new UltraSonic();
		ultraSonic.initializeSensor();
		
		Steering steering = new Steering();
		steering.initializeTransmission();
		
		Motor motor = new Motor();
		motor.initializeTransmission();
		
		testComponents();
		
		runSelfCheck();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Choose a mode:");
		System.out.println("1. Automatic");
		System.out.println("2. Line Tracking");
		System.out.println();
		int choice = scanner.nextInt();
		
		RobotCar robotCar;
		if (choice == 1)
		{
			robotCar = new RobotCar(1);
			//System.out.println();
			//System.out.println("Automatic Mode Chosen");
			//break;
		}
		else if (choice == 2)
		{
			robotCar = new RobotCar(2);
			//System.out.println();
			//System.out.println("Line Tracking Mode Chosen");
			//break;
		}
		else
		{
		System.out.println();
		System.out.println("Invalid Choice");
		}

	}

	private static void testComponents() {
		// TODO Auto-generated method stub
		componentCheck = true;
		System.out.println("Components Working");
		
	}

	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return name;
	}

	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
}
