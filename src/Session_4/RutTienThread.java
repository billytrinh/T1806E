package Session_4;

public class RutTienThread extends Thread{
    public Account account = new Account();

    public RutTienThread(Account account){
        this.account = account;
    }

    public void run(){
        this.account.rutTien(30000);
    }

}
