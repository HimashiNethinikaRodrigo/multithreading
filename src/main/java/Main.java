public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                // code that will run in a new thread
                System.out.println("We're now in thread " + Thread.currentThread().getName());
            }
        });
        System.out.println("We're in thread: " + Thread.currentThread().getName() + " before starting a new thread");
        // start thread - jvm to create new thread and pass it to operating system
        thread.start();
        System.out.println("We're in thread: " + Thread.currentThread().getName() + " after starting a new thread");

        Thread.sleep(10000);

        /*
         * Output:
         * We're in thread: main before starting a new thread
         * We're in thread: main after starting a new thread
         * We're now in thread Thread-0
         */

    }
}
