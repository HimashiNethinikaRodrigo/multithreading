package com.edu.thread.threadclass;

public class ThreadClass_1{
    public static void main(String[] args) {
        Thread thread = new WorkerThread();
        thread.setName("Worker Thread");
        thread.start();
    }

    private static class WorkerThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from " + this.getName());
        }
    }


    /*
     * Output:
     * Hello from Worker Thread
     */
}
