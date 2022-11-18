package com.edu.thread.runable;

/**
 * handle exception in thread
 */
public class ThreadClass_4 {
    public static void main(String[] args) {
        Thread thread = new Thread(( )-> {
           throw new RuntimeException("Intentional Exception");
        });

        thread.setName("Exception Thread");

        thread.setUncaughtExceptionHandler((thread1, throwable) ->
                System.out.println("A critical error has happened in thread " + thread1.getName()
                        + " the error is " + throwable.getMessage())
        );

        thread.start();

        /*
         * Output:
         * A critical error has happened in thread Exception Thread the error is Intentional Exception
         *
         */
    }
}
