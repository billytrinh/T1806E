package Assignment5_2;

import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String args[]){

        try {
            Connector connector = new Connector();
            Main.showMenu(connector);

        }catch (Exception e) {
        }
    }

    public static void showMenu(Connector connector){

        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        boolean flag = true;
        do {
            do{
                System.out.println("Lua chon chuc nang: ");
                System.out.println("1. Dang nhap");
                System.out.println("2. Dang ky");
                System.out.println("3. Danh sach nguoi dung");
                System.out.println("4. Xoa 1 nguoi dung");
                System.out.println("5. Thoat chuong trinh");
                menu = scanner.nextInt();
            }while (menu <1 || menu > 5);

            switch (menu){
                case 1: Main.login(connector);break;
                case 2: Main.register(connector);break;
                case 5: flag=false; break;
            }
        }while (flag == true);


    }

    public static boolean login(Connector connector){
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap username:");
        String username = scanner.nextLine();
        System.out.println("Nhap password:");
        String password = scanner.nextLine();

        String sql = "SELECT id FROM user WHERE username LIKE '"
                +username+"' AND password LIKE '"+password+"'";

        try{
            ResultSet rs = connector.getQuery(sql);
            if(rs.next()){
                System.out.println("Dang nhap thanh cong.");
                return flag;
            }
            flag = false;
        }catch (SQLException e){

        }

        System.out.println("Khong tim thay nguoi dung");
        return flag;
    }


    public static void register(Connector connector){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap username:");
        String username = scanner.nextLine();
        System.out.println("Nhap email:");
        String email = scanner.nextLine();
        System.out.println("Nhap password:");
        String password = scanner.nextLine();

        String sql = "INSERT INTO user (username,email,password) VALUES('"+username
                +"','"+email+"','"+password+"')";
        if(connector.getUpdate(sql)){
            System.out.println("Dang ky thanh cong.");
            return;
        }
        System.out.println("Dang ky that bai");
    }
}
