package executors;

public class threads implements Runnable {

	
	private String numberOfThread;
	
	public threads(String numberOfThread) {
        this.numberOfThread = numberOfThread;
    }
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Number of Thread = " + numberOfThread);
		getNumber();
		
	}

	private void getNumber() {
		
		 try {
	            Thread.sleep(500);
	        }
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}