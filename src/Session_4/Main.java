package Session_4;

public class Main {
    public static void main(String args[]){
        SubThread subThread = new SubThread();
        subThread.setDaemon(true);
        subThread.start();
        SubThread subThread1 = new SubThread();
        subThread1.start();
        System.out.println("Main thread stop");
    }
}
