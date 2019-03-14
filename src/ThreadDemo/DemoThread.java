package ThreadDemo;

public class DemoThread  extends Thread{

    public void run() {
        int index = 1;
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("  - HelloThread running " + index++);

            try {
                // Ngủ 1030 milli giây.
                Thread.sleep(1030);
            } catch (InterruptedException e) {
            }

        }
        System.out.println("  - ==> HelloThread stopped");
    }


}
