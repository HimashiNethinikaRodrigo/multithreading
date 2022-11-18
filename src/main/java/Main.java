public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                // code that will run in a new thread
            }
        });

        // start thread - jvm to create new thread and pass it to operating system
        thread.start();
    }
}
