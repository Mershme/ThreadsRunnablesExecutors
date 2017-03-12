package runnables;


public class test {

        public static void main(String args[]) {
        	// runs the runnables to test them.
            sandbox runnable1 = new sandbox("Runnable 1");
            runnable1.start();

            sandbox runnable2 = new sandbox("Runnable 2");
            runnable2.start();

            sandbox runnable3 = new sandbox("Runnable 3");
            runnable3.start();
        }

}

