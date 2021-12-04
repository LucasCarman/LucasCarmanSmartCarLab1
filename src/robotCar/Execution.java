package robotCar;


import java.util.Scanner;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


public class Execution implements SelfCheckCapable {
	
	private static boolean componentCheck = false;
	RobotCar robotcar;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LineTrack lineTrack = new LineTrack();
		
		Camera camera = new Camera();
		
		UltraSonic ultraSonic = new UltraSonic();
		
		Steering steering = new Steering();
		
		Motor motor = new Motor();
		
		Communications communications = new Communications();
		

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
		}
		else if (choice == 2)
		{
			robotCar = new RobotCar(2);
		}
		else
		{
		System.out.println();
		System.out.println("Invalid Choice");
		}

	}

	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	public String getComponentName() {

		return null;
	}

	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
}
