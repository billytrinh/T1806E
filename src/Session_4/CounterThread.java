package Session_4;

public class CounterThread extends Thread{

    public Counter counter = new Counter();

    public CounterThread(Counter counter){
        this.counter = counter;
    }


    public void run(){
        for (int i =0;i<3;i++){
            //synchronized (this.counter){
//                this.counter.change();
//                this.counter.print();
                this.counter.nextSNT();
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){};
           // }

        }

    }


}
