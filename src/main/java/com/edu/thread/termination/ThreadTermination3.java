package com.edu.thread.termination;

public class ThreadTermination3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new SleepingThread());
        thread.start();
        thread.interrupt();
    }

    private static class SleepingThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10000000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
