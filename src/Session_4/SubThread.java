package Session_4;

public class SubThread extends Thread{

    public void run(){
        for (int i=0;i<10;i++){

            if(Thread.currentThread().isDaemon()){
                System.out.println("Deamon thread...");
            }else {
                System.out.println("Subthread is running ....");
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            };
        }
    }
}
