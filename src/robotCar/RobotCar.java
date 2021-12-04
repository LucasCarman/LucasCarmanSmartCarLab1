package robotCar;

import java.util.*;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class RobotCar implements SelfCheckCapable{
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
			}
			else if (choice == 2)
			{
				robotState = new LineTrackingState();
				RobotCar.AvoidObstacle();

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


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Robot Car";
	}


	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}


	@Override
	public boolean runSelfCheck() {
		return SelfCheckUtils.checkComponents(this);
	}
}
