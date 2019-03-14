package Session_3;

public class Sub2Thread extends Thread{
    public SoNguyenTo snt;

    public Sub2Thread(SoNguyenTo t){
        this.snt = t;
    }

    public void run(){
        for (int i=0;i<30;i++){
//            snt.change();
//            snt.show();
            snt.nextSnt();
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
