package pkg2;

public class Car {
   public int carId;
   public String color;
   public int carKm;
   public String brand;

   public static int so_banh = 4;

   public Car(){
       System.out.println("Vua tao ra 1 cai o to");
   }

   public Car(int x,int y, String z, String k){
      this.carId = x;
      this.carKm = y;
      this.color = z;
      this.brand = k;
   }

   public static void main(String[] args){
       Car car3 = new Car();
       car3.color = "yellow";
       car3.carId = 3;
       car3.carKm = 3000;
       car3.brand = "Toyota";
       car3.running();
   }

   public void running(){
       System.out.println("Xe dang chay....");
   }

   public void reMake(Car x,String new_color){
        x.color = new_color;
   }

}
