package threads;

public class deadLock extends Thread{
    Thread thread;
    // Objects to be accessed by the threads
    Object deadLock1;
    Object deadLock2;
    //Name of the thread
    String name;

    deadLock(String myString, Object deadLock1, Object deadLock2){
        this.deadLock1 = deadLock1;
        this.deadLock2 = deadLock2;
        name = myString;
    }

    public void start(){
        System.out.println("Starting " + name);
        if (thread == null){
            thread = new Thread(this, name);
            thread.start();
        }
    }

	    // accessible by this thread only because of sync
        public void run() {
            synchronized (deadLock1) {
                System.out.println(name + ": Lock 1 on hold");

                try { Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println(name + ": Waiting for Lock 2");

        // accessible by this thread only because of sync
                synchronized (deadLock2) {
                    System.out.println(name + ": Lock 1 and 2 on hold");
                }
            }
        }

}
