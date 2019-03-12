package Session_4;

public class Counter {
    public int count = 2;

    public synchronized void change(){
        this.count++;
    }

    public synchronized void print(){
        System.out.println(Thread.currentThread().getName()+" count = "+this.count);
    }

    public synchronized void nextSNT(){
        for (int i=this.count+1;true;i++){
            if(Counter.check(i)){
                System.out.println(Thread.currentThread().getName()+" SNT tiep theo: "+i);
                this.count = i;
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
                break;
            }
        }
    }

    public static boolean check(int n){
        for (int i =2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
