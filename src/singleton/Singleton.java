package singleton;

public class Singleton {
	
	private static Integer instanceCount;
	
	private Singleton(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		instanceCount++;
	}
	
	public static Singleton getInstance() {
		return new Singleton();
	}
	
	public String getName(){
		return "Highlander";
	}
	
	public static int getInstanceCount(){
		return instanceCount;
	}

}
