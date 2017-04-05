package executors;


import java.util.concurrent.*;

public class executorMain {

    public static void main(String[] args) {

//      runs 10 at the same time
        ExecutorService newExec = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            Runnable worker = new threads(" " + i);
            newExec.execute(worker);
        }
        newExec.shutdown();

        while (!newExec.isTerminated()) {
        }

        System.out.println("All of the threads have finished :)");
    }

    
}
