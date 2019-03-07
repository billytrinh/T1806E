package Session_3;

public class Sub2Thread implements Runnable{

    @Override
    public void run(){
        for (int i=0;i<10;i++){
            try {
                System.out.println("    Running in sub thread --"+i);
                Thread.sleep(1000);
            }catch (InterruptedException e){}

        }
    }
}
