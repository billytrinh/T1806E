package Session_3;

public class SubThread extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MyJavaThread");
        System.out.println(Thread.currentThread().getName());
//        for (int i=0;i<10;i++){
//            try {
//                System.out.println("    Running in sub thread --"+i);
//                Thread.sleep(1000);
//            }catch (InterruptedException e){}
//
//        }
        int number = 0;
        for (int i=2;number<10;i++){
            if(checkSNT(i)){
                System.out.println("SNT: "+i);
                number++;
                try {
                    Thread.sleep(1500);
                }catch (InterruptedException e){}
            }
        }
    }

    public static boolean checkSNT(int n){
        for (int i=2;i<=n/2;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

}
