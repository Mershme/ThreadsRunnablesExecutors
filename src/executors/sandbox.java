package executors;

public class sandbox implements Runnable {

    private String ThreadNumber;

    public sandbox(String ThreadNumber) {
        this.ThreadNumber = ThreadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName() + ", Thread number = " + ThreadNumber);
        getID();
    }

    private void getID() {
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}