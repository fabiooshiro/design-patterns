package command;

public abstract class AbstractCommand implements Command{
	
	public final int STEPSIZE = 30;
	
	protected void delay(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
