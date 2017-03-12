package threads;

public class sandbox extends Thread {
    private Thread thread;
    private String name;

    sandbox(String myString){
        name = myString;
        System.out.println("Creating" + name);
    }

    public void run(){
        System.out.println("Running" + name);
    }

    public void start(){
        System.out.println("Starting" + name);
        if (thread == null){
            thread = new Thread(this, name);
            thread.start();
        }
    }
}

