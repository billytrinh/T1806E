package Session_4;

public class Account {
    public int money = 10000;

    public synchronized void rutTien(int de_money){
        if(this.money < de_money){
            System.out.println("Khong du tien de rut..");
            try {
                wait();
            }catch (Exception e){}
        }
        this.money -= de_money;
        System.out.println(Thread.currentThread().getName()+ " - Rut thanh cong so tien: "+de_money);
    }

    public synchronized void napTien(int de_money){
      //  for (int i= 0;i<5;i++){
            this.money += de_money;
            System.out.println("Nap tien thanh cong so tien: "+de_money);
            try {
                notify();
               // Thread.sleep(500);
            }catch (Exception e){}
       // }

    }

}
