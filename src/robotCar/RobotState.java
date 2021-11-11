package robotCar;

public interface RobotState {
	
	public void Drive() throws InterruptedException;

	public void AvoidObstacle() throws InterruptedException;

}
