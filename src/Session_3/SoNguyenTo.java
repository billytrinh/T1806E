package Session_3;

public class SoNguyenTo {
    public int x =0;
   // public int y = 0;
    public int snt = 0;
    public synchronized void show(){
        System.out.println("tang x: "+x);
        System.out.println("--------------");
        try {
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public synchronized void change(){
        x++;
        try {
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public synchronized void nextSnt(){
        for (int i=snt+1;true;i++){
            if(SoNguyenTo.check(i)){
                System.out.println("Next: "+i);
                snt = i;
                return;
            }
        }
    }

    public static boolean check(int n){
        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
