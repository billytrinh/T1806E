package demotrycatch;

public class Main {

    public static void main(String[] args) throws Exception{
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
