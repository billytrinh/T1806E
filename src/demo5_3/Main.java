package demo5_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        MyGeneric<Integer,Integer> myGeneric1 = new MyGeneric();
        MyGeneric<String,String> myGeneric2 = new MyGeneric();
        MyGeneric<Integer,String> myGeneric3 = new MyGeneric();
        MyGeneric<String,Integer> myGeneric4 = new MyGeneric();

        myGeneric1.xValue = 1234;
        Integer x1 = myGeneric1.getxValue();
        myGeneric1.setxValue(2345);

        myGeneric1.genericMethod("hello generic");
        myGeneric1.genericMethod(1);

        Integer[] integers = new Integer[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 5;
        myGeneric1.genericMethod2(integers);

        myGeneric2.xValue = "demo x value";
        String x2 = myGeneric2.getxValue();

    }
}
