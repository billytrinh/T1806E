package Demo;

public class Main {

    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.an();
        dog1.age = 1;
        System.out.println(dog1.type);
        //dog1.type = "cho";
        dog1.sua();
        dog1.chay(5);
        dog1.chay();
        Animal animal1 = new Animal();
        //animal1.sua();
        Jdog jdog = new Jdog();
        jdog.chay();
        jdog.chay(6);
        System.out.println("jDog "+jdog.type);
    }

    public static void main2(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello");
        stringBuilder.append(" world");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.delete(2,5));
        System.out.println(stringBuilder.reverse());

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("demo");
        System.out.println(stringBuffer);
    }
}
