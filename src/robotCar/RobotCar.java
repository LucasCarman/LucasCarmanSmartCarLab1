package robotCar;

import java.util.*;

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
		
		modeSelection();
		

		

		
		
		
		
	}
	private static void testComponents()
	{
		componentCheck = true;
		System.out.println("Components Working");
	}

	private static void modeSelection()
	{
		while (true) 
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println();
			System.out.println("Choose a mode:");
			System.out.println("1. Automatic");
			System.out.println("2. Line Tracking");
			System.out.println();
			int choice = scanner.nextInt();
			
			if (choice == 1)
			{
				System.out.println();
				System.out.println("Automatic Mode Chosen");
				break;
			}
			else if (choice == 2)
			{
				System.out.println();
				System.out.println("Line Tracking Mode Chosen");
				break;
			}
			System.out.println();
			System.out.println("Invalid Choice");
			
		}
	}
}
