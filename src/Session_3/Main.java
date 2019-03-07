package Session_3;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Running thread: " + Thread.currentThread().getName());
        for (int i =0;i<3;i++){
            System.out.println("Running main thread -- "+i);

        }
        SubThread subThread = new SubThread();
        subThread.start();
        subThread.setName("Sub thread");
        System.out.println(subThread.getName());
        for (int i =3;i<10;i++){
            System.out.println("Running main thread -- "+i);
            Thread.sleep(2000);
        }
    }

}
