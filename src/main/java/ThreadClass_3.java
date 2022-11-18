/**
 * create thread with name and priority
 * convert runnable method to lambda expression
 */
public class ThreadClass_3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            // code that will run in a new thread
            System.out.println("We're now in thread " + Thread.currentThread().getName());
            System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
        });

        thread.setName("New worker thread 2");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We're in thread: " + Thread.currentThread().getName() + " before starting a new thread");
        // start thread - jvm to create new thread and pass it to operating system
        thread.start();
        System.out.println("We're in thread: " + Thread.currentThread().getName() + " after starting a new thread");

        Thread.sleep(1000);

        /*
         * Output:
         * We're in thread: main before starting a new thread
         * We're in thread: main after starting a new thread
         * We're now in thread New worker thread 2
         * Current thread priority is 10
         */

    }
}
