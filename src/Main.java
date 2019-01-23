import java.util.Scanner;

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

    }
}
