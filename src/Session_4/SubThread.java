package Session_4;

public class SubThread extends Thread{

    public void run(){


            if(Thread.currentThread().isDaemon()){
                for (int i=0;i<10;i++) {
                    System.out.println("Deamon thread...");
                    try {
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    };
                }
            }else {
                for (int i=0;i<3;i++) {
                    System.out.println(Thread.currentThread()
                            .getName()+" is running ....");
                    try {
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        System.out.println(e.getMessage());
                    };
                }

            }

        }
}

