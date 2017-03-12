package executors;

public class sandbox implements Runnable {

    private String action;

    public sandbox(String myString) {
        this.action = myString;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+" Begin: Action = "+ action);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" Finished.");
    }

    private void processCommand() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }




    public String toString(){
        return this.action;
    }

}
