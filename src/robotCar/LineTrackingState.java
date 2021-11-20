package robotCar;

public class LineTrackingState implements RobotState{
	
	private int distanceArray [] = {3, 5, 6, 4, 1, 5, 2, 8, 1, 9, 4 ,2, 1};

	public void Drive() throws InterruptedException
	{
		for (int i : distanceArray)
		{
			if (i<2)
			{
				AvoidObstacle();
			}
			Thread.sleep(1000);
			System.out.println("Driving");
		}
		
	}

	@Override
	public void AvoidObstacle() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Centering on line");
		Thread.sleep(1000);
		Drive();
		
	}

}
