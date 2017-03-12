package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {

    public static void main(String[] args) {

        // Creates executor that can run 5 runnables
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable myRunnable = new sandbox(" " + i);
            executor.execute(myRunnable);
        }
        executor.shutdown();

        // executors will not work if a null is entered into them.  Example of this:
        try {
            ExecutorService nullExecutor = Executors.newSingleThreadExecutor();
            nullExecutor.execute(null);
        }catch (Exception e){
            System.out.println("Null value cannot be entered");
        }


        System.out.println("Task Completed!");

    }
}
