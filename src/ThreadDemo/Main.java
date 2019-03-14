package ThreadDemo;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Customer customer = new Customer();

        Thread t1 = new Thread(){

            public void run() {
                customer.rutTien(20000);
            }

        };

        t1.start();

        Thread t2 = new Thread(){

            public void run() {
                customer.nopTien(30000);
            }
        };

        t2.start();
    }

    public static void main2(String[] args) throws InterruptedException{
        int idx = 1;
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 2; i++) {

            System.out.println("Main thread running " + idx++);
            // Ngủ 2101 milli giây.
            Thread.sleep(2101);
        }

        DemoThread helloThread = new DemoThread();
        helloThread.setName("hello thread");
        helloThread.setPriority(Thread.MAX_PRIORITY);
        // Chạy thread
        helloThread.start();

       // helloThread.isInterrupted();
        for (int i = 0; i < 3; i++) {
            System.out.println("Main thread running " + idx++);
            // Ngủ 2101 milli giây.
            Thread.sleep(2101);
        }

        System.out.println("==> Main thread stopped");
    }

}
