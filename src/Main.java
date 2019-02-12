import java.util.Scanner;
import pkg2.*;
import Animal.*;

public class Main {

    public int he_so = 10;
    static int he_16 = 16;

    public final static String  mua_xuan = "mua_xuan";

    public enum seasion{mua_xuan,mua_he,mua_thu,mua_dong};

    public static void main(String[] args) {
        System.out.println("Chon chuc nang:");
        System.out.println("1.Nhap so nguyen");
        System.out.println("2.Nhap so thuc");
        Scanner scanner = new Scanner(System.in);
        int cn = scanner.nextInt();
        System.out.println("Nhap 1 so:");
        SoNguyen soNguyen = new SoNguyen();
        if(cn == 1){
            int x = scanner.nextInt();
            soNguyen.tinhToan(x);
        }else {
            float x = scanner.nextFloat();
            soNguyen.tinhToan(x);
        }
        
//        Dog dog1 = new Dog("Chó nhật","đen",3,2);
//        Cat cat1 = new Cat(1,"Mèo đen","Vàng",1,2);
//        if(dog1.weight > cat1.weight){
//            dog1.sua(2);
//            cat1.chay();
//        }else {
//            cat1.cao();
//            dog1.chay();
//        }
    }

    public static void main2(String[] args) {
//        Customer objCustomer1 = new Customer();
//        objCustomer1.customerId = 1;
//        objCustomer1.customerName = "Nguyen van An";
//        objCustomer1.age = 18;
//        objCustomer1.address = "8 Ton that thuyet";

//        Customer objCustomer2 = new Customer();
//        objCustomer2.customerId = 2;
//        objCustomer2.customerName = "Le van Tam";
//        objCustomer2.age = 20;
//        objCustomer2.address = "8 Ton that thuyet";

//        if(objCustomer1.age > objCustomer2.age){
//            System.out.println(objCustomer1.customerName + " nhieu tuoi hon");
//        }else{
//            System.out.println(objCustomer2.customerName + " nhieu tuoi hon");
//        }

        Scanner scanner = new Scanner(System.in);
        Car[] car_arr = new Car[5];
        for (int i=0;i< 5;i++){
            System.out.println("nhap car ID: ");
            int carId = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nhap car Color: ");
            String carColor = scanner.nextLine();
            System.out.println("nhap car carKm: ");
            int carKm = scanner.nextInt();
            scanner.nextLine();
            System.out.println("nhap car Brand: ");
            String carBrand = scanner.nextLine();
            System.out.println("nhap car Price: ");
            int carPrice = scanner.nextInt();
            scanner.nextLine();
            car_arr[i] = new Car(carId,carKm,carColor,carBrand,carPrice);
        }

        int so_tien = scanner.nextInt();
        Customer objcus = new Customer(1,"Le van A",25,"8 ton that thuyet",so_tien);
        objcus.kiemTraKhaNang(car_arr);
//        Car car1 = new Car();
//        car1.carId = 1;
//        car1.color = "Red";
//        car1.carKm = 1000;
//        car1.brand = "BMW";
//        System.out.println("Mau xe: "+ car1.color);
//        //car1.running();
        //Car car2 = new Car(5,7500,"Yellow","Honda");
//        car2.carId = 2;
//        car2.color = "GREEN";
//        car2.carKm = 2000;
//        car2.brand = "Audi";
//
//        car1.reMake(car2,"Pink");
//        System.out.println("Mau xe: "+ car1.color);


    }
}
