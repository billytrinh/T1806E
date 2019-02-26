package demotrycatch;

import java.time.*;

interface Sum{
    int tinhtong(int a,int b);
}

public class Main {

    public static void main(String[] args){
        SayHello xx = new SayHello() {
            @Override
            public void sayHello() {
                System.out.println("say Hello");
            }
        };
        xx.sayHello();

        SayHello xx2 = () -> {
            System.out.println("Lambda ...");
        };
        xx2.sayHello();

        Sum sum = (int a,int b)->{return  a+b;};
        System.out.println("tong 2 so: "+sum.tinhtong(4,5));

        /*
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("day of year: "+localDate.getDayOfYear());
        System.out.println("day of month: "+localDate.getDayOfMonth());
        System.out.println("day of week: "+localDate.getDayOfWeek());
        System.out.println("Next day: "+localDate.plusDays(1));
        LocalDate localDate1 = LocalDate.of(1999,2,28);
        System.out.println(localDate1);
        System.out.println("Next day: "+ localDate1.plusDays(1));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.plusHours(1));
        LocalDateTime localDateTime1 = LocalDateTime.of(2000,3,20,12,40,12,0);
        System.out.println(localDateTime1);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2018,2,12,4,20,22,1,ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println(zonedDateTime1 );
        */
    }


    public static void main2(String[] args) throws Exception{
        int x = 0;
        int y = 0;
        try{
            x++;
            System.out.println("x = "+x);
          //  int z = x/y;
//            if(x==0||y==0){
//                throw new Exception("Khong su dung so 0 duoc");
//            }
           // System.out.println("z= "+z);
        }catch (ArrayStoreException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException arthEx){
            System.out.println("Error: "+arthEx.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Xay ra loi");
        }

        System.out.println("ket thuc");
    }

}
