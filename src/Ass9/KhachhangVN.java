package Ass9;

import java.time.LocalDate;

public class KhachhangVN extends Khachhang {
    String doituongKH;

    public KhachhangVN(int MKH, String name, LocalDate ex_date,int soluong, String doituongKH){
        this.MKH = MKH;
        this.name = name;
        this.ex_date = ex_date;
        this.soluong = soluong;
        this.doituongKH = doituongKH;
    }

    @Override
    public int tinhtien() {
        int thanhtien = 0;
        if(this.soluong < Khachhang.DM1){
            thanhtien = this.soluong*Khachhang.M1;
        }else if(this.soluong >= Khachhang.DM1 && this.soluong <= Khachhang.DM2){
            thanhtien = Khachhang.DM1*Khachhang.M1+ (this.soluong-Khachhang.DM1)*Khachhang.M2;
        }else if(this.soluong > Khachhang.DM2 && this.soluong <= Khachhang.DM3){
            thanhtien = Khachhang.DM1*Khachhang.M1+ (Khachhang.DM2-Khachhang.DM1)*Khachhang.M2 + (this.soluong - Khachhang.DM2)*Khachhang.M3;
        }else {
            thanhtien = Khachhang.DM1*Khachhang.M1+ (Khachhang.DM2-Khachhang.DM1)*Khachhang.M2 + (Khachhang.DM3-Khachhang.DM2)*Khachhang.M3 + (this.soluong - Khachhang.DM3)*Khachhang.M4;
        }
        return thanhtien;
    }
}
