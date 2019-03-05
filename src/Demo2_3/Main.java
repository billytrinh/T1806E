package Demo2_3;

import java.util.*;
import java.util.stream.Stream;

import Ass8.*;
import demotrycatch.SayHello;

interface Hello{
    void sayHello();
}

interface LambdaDemo{
    void demo(String x);
}

public class Main {
    public static void main(String[] args){
//        int x = -2;
//        int y = Math.abs(x);
//        System.out.println(y);
//
//        String str = "hello world";
//        System.out.println(str.toUpperCase());
//
//        String[] arr = str.split(" ");
//
//        System.out.println((int)Math.floor(3.1415));
//        System.out.println(Math.ceil(3.1415));
//        System.out.println(Math.round(3.1415));
//
//        ArrayList<String> stringArrayList = new ArrayList<>();
//        stringArrayList.add("a");
//        stringArrayList.add("b");
//        stringArrayList.add("c");
//        stringArrayList.add("d");
//
//        for (String stri: stringArrayList){
//            System.out.println(stri);
//        }
//
//        Iterator itr = stringArrayList.iterator();
//
//        while (itr.hasNext()){
//            String e = (String)itr.next();
//            if(e.equals("b")){
//               // itr.remove();
//            }else {
//                System.out.println(e);
//            }
//        }
//
//        List<String> stringArrayList1 = stringArrayList.subList(0,2);
//        for (String stri:stringArrayList1){
//            System.out.println(stri);
//        }
//
//        System.out.println(stringArrayList.indexOf("d"));
//
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        HashMap inputData = new HashMap();
//
//        inputData.put("ID",scanner.nextInt());
//        inputData.put("name",scanner.nextLine());
//        inputData.put("age",scanner.nextInt());
//        inputData.put("address",scanner.nextLine());
//       // inputData.put("gpa",scanner.nextFloat());
//
//    Student student = new Student((int)inputData.get("ID"),(String)inputData.get("name"),
//        (int)inputData.get("age"),(String)inputData.get("address"),
//            (inputData.containsKey("gpa")?(float)inputData.get("gpa"):0) );
//
//
//        ArrayList<HashMap> hashMapArrayList= new ArrayList<>();
//        for (int i=0;i<10;i++){
//            inputData.put("ID",scanner.nextInt());
//            inputData.put("name",scanner.nextLine());
//            inputData.put("age",scanner.nextInt());
//            inputData.put("address",scanner.nextLine());
//            inputData.put("gpa",scanner.nextFloat());
//            hashMapArrayList.add(inputData);
//        }

        ArrayList<String> arrString = new ArrayList<>();
        arrString.add("a");
        arrString.add("aa");
        arrString.add("c");
        arrString.add("cd");
        arrString.add("b");
        arrString.add("bb");
        arrString.add("abc");

        arrString.stream()
                .map(s -> {return s.toUpperCase();})
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o2.compareTo(o1);
                    }
                });
                //.forEach(s -> System.out.println(s));
        for (String x:arrString){
            System.out.println(x);
        }

        SayHello sayHello = new SayHello() {
            @Override
            public void sayHello() {
                System.out.println("Hello...");
            }
        };

        sayHello.sayHello();

        SayHello sayHello2 = ()->{
            System.out.println("Hello 2");
        };

        sayHello2.sayHello();

        LambdaDemo lambdaDemo = (String x) ->{
            System.out.println("Hello "+x);
        };
        lambdaDemo.demo("aaaa");
    }
}
