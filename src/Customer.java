import pkg2.*;
public class Customer {
    public int customerId;
    String customerName;
    int age;
    String address;
    int money;

    public Customer(int customerId,String customerName, int age,String address,int money){
        this.customerId = customerId;
        this.customerName = customerName;
        this.age = age;
        this.address = address;
        this.money = money;
    }

    public void kiemTraKhaNang(Car[] cars){
        Car car_tmp = new Car();
        for (int i=0;i<5;i++){
            if(cars[i].price < this.money && car_tmp.price < cars[i].price){
                car_tmp.carId =  cars[i].carId;
                car_tmp.color =  cars[i].color;
                car_tmp.carKm =  cars[i].carKm;
                car_tmp.brand =  cars[i].brand;
                car_tmp.price =  cars[i].price;
            }
        }
        System.out.println("Kh mua dc o to: "+ car_tmp.brand+ " - gia tien:"+ car_tmp.price);
    }

}
