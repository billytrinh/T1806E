package Session_4;

public class Counter {
    public int count = 0;

    public synchronized void change(){
        this.count++;
    }

    public synchronized void print(){
        System.out.println(Thread.currentThread().getName()+" count = "+this.count);
    }

}
