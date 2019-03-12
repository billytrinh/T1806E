package Session_4;

public class Customer {

    public static void main(String args[]){
        Account account = new Account();
        RutTienThread rutTienThread = new RutTienThread(account);
        RutTienThread rutTienThread2 = new RutTienThread(account);
        NapTienThread napTienThread = new NapTienThread(account);
        rutTienThread.start();
       // rutTienThread2.start();
        napTienThread.start();
    }

}
