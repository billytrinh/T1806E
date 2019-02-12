package Animal;

public class Dog {

    public int ID;
    public String type;
    public String color;
    public int weight;
    public int age;

    public Dog(int ID,String type,String color,int weight,int age){
        this.ID = ID;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public Dog(String type,String color,int weight,int age){
        this.ID = 5;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }


    public void sua(){
        System.out.println("Sủa...");
    }

    public void sua(String cau_noi){
        System.out.println("Sủa..."+ cau_noi);
    }

    public void sua(int x){
        System.out.println(x+" con meo");
    }

    public int sua(int x,int y){
        return 0;
    }

    public void an(){
        System.out.println("Ăn...");
    }

    public void chay(){
        System.out.println("Chạy...");
    }

}
