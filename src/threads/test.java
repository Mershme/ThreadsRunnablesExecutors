package threads;

public class test {
	// Declares the deadlock objects
    public static Object deadLock1 = new Object();
    public static Object deadLock2 = new Object();
    public static Object deadLock3 = new Object();
    public static Object deadLock4 = new Object();

    public static void main(String args[]) {
        sandbox thread1 = new sandbox( "Thread-1");
        thread1.start();

        sandbox thread2 = new sandbox( "Thread-2");
        thread2.start();

        sandbox thread3 = new sandbox( "Thread-3");
        thread3.start();


        // This is when the Sync is working
        deadLock ThreadLock3 = new deadLock("ThreadLock3", deadLock3, deadLock4);
        ThreadLock3.start();

        deadLock ThreadLock4 = new deadLock("ThreadLock4", deadLock3, deadLock4);
        ThreadLock4.start();

		//This is when the Sync is not working
        deadLock ThreadLock1 = new deadLock("ThreadLock1", deadLock1, deadLock2);
        ThreadLock1.start();

        deadLock ThreadLock2 = new deadLock("ThreadLock2", deadLock2, deadLock1);
        ThreadLock2.start();

    }
}
