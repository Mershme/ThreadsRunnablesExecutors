package runnables;

public class sandbox implements Runnable{

	// Creates variables for the thread and thread name
    private Thread thread;
    private String name;

    // assigns string to name and creates it
    sandbox(String myString) {
        name = myString;
        System.out.println("Creating " +  name );
    }

    // Runs the thread and catches it if it gets interrupted
    public void run() {
        System.out.println("Running " +  name );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + name + ", " + i);
                Thread.sleep(50);
            }
            }
        catch (InterruptedException e) {
                System.out.println("Thread " +  name + " interrupted.");
            }
        // Prints that it is exiting out of thread
        System.out.println("Thread " +  name + " exiting.");
    }

    // Starts the thread
    public void start () {
        System.out.println("Starting " +  name );
        if (thread == null) {
            thread = new Thread (this, name);
            thread.start ();
        }
    }
}

