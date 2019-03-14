package Session_3;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        SoNguyenTo soNguyenTo = new SoNguyenTo();
        soNguyenTo.snt = 12;
        SubThread subThread1 = new SubThread(soNguyenTo);
        SubThread subThread2 = new SubThread(soNguyenTo);
        subThread1.start();
        subThread2.start();
        System.out.println("stop main");
    }

    public static void main2(String[] args) throws InterruptedException{
        System.out.println("Running thread: " + Thread.currentThread().getName());
        for (int i =0;i<3;i++){
            System.out.println("Running main thread -- "+i);

        }
      // subThread.start();
//        try{
//            subThread.join();
//        }catch (Exception e){}
//        subThread.setName("Sub thread");
//        System.out.println(subThread.getName());
//        for (int i =3;i<10;i++){
//            System.out.println("Running main thread -- "+i);
//            Thread.sleep(2000);
//        }

        // Using Runnable interface
      //  Sub2Thread sub2Thread = new Sub2Thread();
//      //  Thread thread = new Thread(sub2Thread);
//        //thread.setDaemon(true);
//        thread.start();
//        System.out.println(thread.isAlive());
//        try{
//            thread.join();
//        }catch (Exception e){}
//        System.out.println("stop main");
    }

}
