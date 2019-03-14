package Session_3;

public class SubThread extends Thread{
    public SoNguyenTo snt ;

    public SubThread(SoNguyenTo t){
        this.snt = t;
    }

    public void run(){
        for (int i = 0;i< 10;i++){
//            snt.change();
//            snt.show();
            snt.nextSnt();
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }

}
