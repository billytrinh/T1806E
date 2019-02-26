package Ass9;

import java.time.LocalDate;

public class KhachhangNN extends Khachhang {
    public String quoctich;

    public KhachhangNN(int MKH, String name, LocalDate ex_date, int soluong, String quoctich){
        this.MKH = MKH;
        this.name = name;
        this.ex_date = ex_date;
        this.soluong = soluong;
        this.quoctich = quoctich;
    }

    public int tinhtien(){
        return this.soluong* Khachhang.M4;
    }
}
