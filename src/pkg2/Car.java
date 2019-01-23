package pkg2;

public class Car {
   public int carId;
   public String color;
   public int carKm;
   public String brand;
   public int price;

   public static int so_banh = 4;

   public Car(){
       System.out.println("Vua tao ra 1 cai o to");
   }

   public Car(int carId,int carKm, String color, String brand,int price){
      this.carId = carId;
      this.carKm = carKm;
      this.color = color;
      this.brand = brand;
      this.price = price;
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
