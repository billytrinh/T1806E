package Assigment5;

public class Product {
    public int ID;
    public String productName;
    public int price;
    public int qty;
    public String productType;// ao , nhan, fashion, jewelry

    public Product(int ID,String productName,int price,int qty,String productType){
        this.ID = ID;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
        this.productType = productType;
    }
}
