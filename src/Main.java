import java.util.Scanner;

public class Main {

    public int he_so = 10;

    public final static String  mua_xuan = "mua_xuan";

    public enum seasion{mua_xuan,mua_he,mua_thu,mua_dong};

    public static void main(String[] args) {
       SoNguyen objSN = new SoNguyen();
       objSN.nhapGiaTri();
       System.out.println("GT: "+objSN.tinhGiaiThua());
       objSN.nhapSoThuNhat();
       objSN.nhapSoThuHai();
        System.out.println("Tong: "+objSN.tinhTong());
        System.out.println("Tong: "+objSN.tinhTong());
        System.out.println("Tong: "+objSN.tinhTong());
    }
}
