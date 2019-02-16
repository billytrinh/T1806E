package Demo;

public class Dog extends Animal implements LiveInterface,AnimalInterface{

    public String color;
    public String type ="cho";

    @Override
    public void hittho() {

    }

    @Override
    public void an() {

    }

    public void sua(){
        System.out.println("Sủa..");
    }



    public void chay(int x){
        System.out.println("chay "+x+" km..");
    }
}
