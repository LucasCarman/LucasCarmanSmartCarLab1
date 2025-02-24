package robotCar;

public class AutomaticState implements RobotState {

	private int distanceArray [] = {3, 5, 6, 4, 1};

	@Override
	public void Drive() throws InterruptedException {
		// TODO Auto-generated method stub
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
		System.out.println("Stopping");
		Thread.sleep(1000);
		System.out.println("Reversing");
		Thread.sleep(1000);
		System.out.println("Turning Left");
		Thread.sleep(1000);
		System.out.println("...");
		Drive();
		
	}

}
