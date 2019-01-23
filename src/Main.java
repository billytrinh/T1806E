import java.util.Scanner;
import pkg2.*;

public class Main {

    public int he_so = 10;
    static int he_16 = 16;

    public final static String  mua_xuan = "mua_xuan";

    public enum seasion{mua_xuan,mua_he,mua_thu,mua_dong};

    public static void main(String[] args) {
        Customer objCustomer1 = new Customer();
        objCustomer1.customerId = 1;
        objCustomer1.customerName = "Nguyen van An";
        objCustomer1.age = 18;
        objCustomer1.address = "8 Ton that thuyet";

        Customer objCustomer2 = new Customer();
        objCustomer2.customerId = 2;
        objCustomer2.customerName = "Le van Tam";
        objCustomer2.age = 20;
        objCustomer2.address = "8 Ton that thuyet";

        if(objCustomer1.age > objCustomer2.age){
            System.out.println(objCustomer1.customerName + " nhieu tuoi hon");
        }else{
            System.out.println(objCustomer2.customerName + " nhieu tuoi hon");
        }

        Car[] car_arr = new Car[5];
        for (int i=0;i< 5;i++){
            car_arr[i] = new Car();
        }

        Car car1 = new Car();
        car1.carId = 1;
        car1.color = "Red";
        car1.carKm = 1000;
        car1.brand = "BMW";
//        System.out.println("Mau xe: "+ car1.color);
//        //car1.running();
        Car car2 = new Car(5,7500,"Yellow","Honda");
//        car2.carId = 2;
//        car2.color = "GREEN";
//        car2.carKm = 2000;
//        car2.brand = "Audi";
//
//        car1.reMake(car2,"Pink");
//        System.out.println("Mau xe: "+ car1.color);


    }
}
