package Session_4;

public class Main {
    public static void main(String args[]){
          Counter counter = new Counter();
          CounterThread counterThread1 = new CounterThread(counter);
          CounterThread counterThread2 = new CounterThread(counter);
          CounterThread counterThread3 = new CounterThread(counter);
          counterThread1.start();
          counterThread2.start();
          counterThread3.start();

//        SubThread subThread1 = new SubThread();
//        subThread1.setName("Thread 1");
//        subThread1.start();
//        try{
//            subThread1.join();
//        }catch (InterruptedException e){}
//
//        SubThread subThread2 = new SubThread();
//        subThread2.setName("Thread 2");
//        //subThread.setDaemon(true);
//        subThread2.start();
        System.out.println("Main thread stop");
    }
}
