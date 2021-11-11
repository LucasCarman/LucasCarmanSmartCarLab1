package robotCar;

import java.util.*;

public class RobotCar {
	private static int sizeX;
	private static int sizeY;
	private static int sizeZ;
	private static String model;
	private static String color;
	private static String [] modeType = {"Automatic, Line Track"};
	private static RobotState robotState;
	public int choice;
	
	public RobotCar(int choice) throws InterruptedException
	{
		this.modeSelection(choice);
	}


	private void modeSelection(int choice) throws InterruptedException
	{
		this.choice = choice;
			if (choice == 1)
			{
				robotState = new AutomaticState();
				RobotCar.Drive();
				//System.out.println();
				//System.out.println("Automatic Mode Chosen");
				//break;
			}
			else if (choice == 2)
			{
				robotState = new LineTrackingState();
				RobotCar.AvoidObstacle();
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



	public static void Drive() throws InterruptedException {
		// TODO Auto-generated method stub
		
		robotState.Drive();
	}
	
	public static void AvoidObstacle() throws InterruptedException
	{
		robotState.AvoidObstacle();
	}
}
