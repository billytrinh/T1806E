package Demo;

public class Animal extends Live {

    public class Ani{
        public void sayHello(){
            System.out.println("Ani say hello..");
        }
    }

    public static class Anima{
        public void sayHello(){
            System.out.println("Anima say hello..");
        }
    }

    public String type = "Animal";
    public int age;

    @Override
    public void demo() {

    }



    public void chay(){
        System.out.println("Chạy..");
    }

}
