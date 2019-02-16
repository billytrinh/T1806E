package Assigment5;

public class Fashion extends Product {
    public int size;
    public String color;
    public String brand;

    public Fashion(int ID, String productName,int price,int qty,int size,
                   String color,String  brand){
        super(ID,productName,price,qty);
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    public void giat(){
        System.out.println("Giặt...");
    }

    public void lamKho(){
        System.out.println("Làm khô...");
    }

}
