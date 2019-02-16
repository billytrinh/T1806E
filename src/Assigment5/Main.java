package Assigment5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Product> productArrayList = new ArrayList<Product>();
        productArrayList.add(new Product(1,"Áo hàng hiệu",10000,5));
        productArrayList.add(new Product(2,"Nhẫn kim cương",100000,5));

        Order order = new Order();
        order.buyItem(productArrayList.get(0),2);
        order.buyItem(productArrayList.get(1),3);

        System.out.println("Danh sách sản phẩm trong đơn hàng:");
        for (Product pr:order.productArrayList){
            System.out.println(pr.ID+"--"+ pr.productName);
        }
        System.out.println("Tổng tiền: "+order.grandTotal);

        for (Product pr:productArrayList){
            System.out.println(pr.ID+"--"+ pr.productName+ "--"+pr.qty);
        }
    }
}
