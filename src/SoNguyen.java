import java.util.Scanner;

public class SoNguyen{

    int so_can_tinh;

    public int so_thu_nhat;
    public int so_thu_hai;

    public void nhapGiaTri(){
        System.out.println("Nhap n=");
        Scanner scanner = new Scanner(System.in);
        this.so_can_tinh = scanner.nextInt();
    }

    public void nhapSoThuNhat(){
        System.out.println("Nhap so thu nhat:");
        Scanner scanner = new Scanner(System.in);
        this.so_thu_nhat = scanner.nextInt();
    }

    public void nhapSoThuHai(){
        System.out.println("Nhap so thu hai:");
        Scanner scanner = new Scanner(System.in);
        this.so_thu_hai = scanner.nextInt();
    }

    public int tinhGiaiThua(){
        int n = this.so_can_tinh;
        int gt = 1;
        for (int i=1;i<=n;i++){
            gt*=i;
        }
        return  gt;
    }

    public int tinhTong(){
        return this.so_thu_nhat + this.so_thu_hai;
    }

    public void tinhToan(int x){
        int gt = 1;
        for (int i=1;i<=x;i++){
            gt*=i;
        }
        System.out.println("Ket qua: "+gt);
    }

    public void tinhToan(float x){
        System.out.println("Ket qua: "+(x*x));
    }


}