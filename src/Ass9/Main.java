package Ass9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] agrs){
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KhachhangVN(1,"Nguyen van A", LocalDate.parse("2019-12-12"),97,"Ca nhan"));
        arrayList.add(new KhachhangVN(2,"Nguyen van B", LocalDate.parse("2019-01-12"),197,"Ca nhan"));
        arrayList.add(new KhachhangNN(3,"Xyz",LocalDate.parse("2019-02-12"),297,"Iraq"));
        arrayList.add(new KhachhangNN(4,"Abc", LocalDate.parse("2018-05-12"),23,"Iran"));
        int soluong_khVN = 0;
        int soluong_khNN = 0;
        float tongtienNN = 0;
        ArrayList<String> hd = new ArrayList<>();
        for(int i=0;i< arrayList.size();i++){
            if(arrayList.get(i) instanceof  KhachhangVN){
                KhachhangVN x = (KhachhangVN)arrayList.get(i);
                System.out.println(x.MKH+" Ten: "+x.name+" so tien: "+x.tinhtien());
                soluong_khVN++;
                if(x.ex_date.getMonth().getValue() == 2 && x.ex_date.getYear() == 2019){
                    hd.add(x.MKH+" Ten: "+x.name+" so tien: "+x.tinhtien());
                }
            }else {
                KhachhangNN y = (KhachhangNN)arrayList.get(i);
                System.out.println(y.MKH+" Ten: "+y.name+" so tien: "+y.tinhtien());
                soluong_khNN++;
                tongtienNN+= y.tinhtien();
                if(y.ex_date.getMonth().getValue() == 2 && y.ex_date.getYear() == 2019){
                    hd.add(y.MKH+" Ten: "+y.name+" so tien: "+y.tinhtien());
                }
            }
        }
        System.out.println("KH VN: "+soluong_khVN+" Kh NN: "+soluong_khNN);
        System.out.println("trung binh tien KHNN: "+tongtienNN/soluong_khNN);
        for (String i:hd){
            System.out.println(i);
        }
    }
}
