package executors;

import java.util.concurrent.*;

public class test {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        try {
            for (int i = 0; i < 5; i++) {
            	sandbox rfee = new sandbox(" " + i);
                executorService.execute(rfee);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }

        System.out.println("Your Threads have been woven!");
    }

}