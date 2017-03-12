package handlers;

public class sandbox extends Thread {
    private Thread thread;
    private String name;
    // Creates the Thread
    sandbox(String myString){
        name = myString;
        System.out.println("Creating" + name);
    }
    // Runs it
    public void run(){
        System.out.println("Running" + name);
    }
    // Starts it
    public void start(){
        System.out.println("Starting" + name);
        if (thread == null){
            thread = new Thread(this, name);
            thread.start();
        }
    }
}

