package Demo2_3;

import java.util.*;
import Ass8.*;
public class Main {
    public static void main(String[] args){
        int x = -2;
        int y = Math.abs(x);
        System.out.println(y);

        String str = "hello world";
        System.out.println(str.toUpperCase());

        String[] arr = str.split(" ");

        System.out.println((int)Math.floor(3.1415));
        System.out.println(Math.ceil(3.1415));
        System.out.println(Math.round(3.1415));

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("c");
        stringArrayList.add("d");

        for (String stri: stringArrayList){
            System.out.println(stri);
        }

        Iterator itr = stringArrayList.iterator();

        while (itr.hasNext()){
            String e = (String)itr.next();
            if(e.equals("b")){
               // itr.remove();
            }else {
                System.out.println(e);
            }
        }

        List<String> stringArrayList1 = stringArrayList.subList(0,2);
        for (String stri:stringArrayList1){
            System.out.println(stri);
        }

        System.out.println(stringArrayList.indexOf("d"));



        Scanner scanner = new Scanner(System.in);

        HashMap inputData = new HashMap();

        inputData.put("ID",scanner.nextInt());
        inputData.put("name",scanner.nextLine());
        inputData.put("age",scanner.nextInt());
        inputData.put("address",scanner.nextLine());
       // inputData.put("gpa",scanner.nextFloat());

    Student student = new Student((int)inputData.get("ID"),(String)inputData.get("name"),
        (int)inputData.get("age"),(String)inputData.get("address"),
            (inputData.containsKey("gpa")?(float)inputData.get("gpa"):0) );


        ArrayList<HashMap> hashMapArrayList= new ArrayList<>();
        for (int i=0;i<10;i++){
            inputData.put("ID",scanner.nextInt());
            inputData.put("name",scanner.nextLine());
            inputData.put("age",scanner.nextInt());
            inputData.put("address",scanner.nextLine());
            inputData.put("gpa",scanner.nextFloat());
            hashMapArrayList.add(inputData);
        }

    }
}
