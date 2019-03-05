package demo5_3;

import java.util.List;

public class MyGeneric <X,Y>{
    public X xValue;
    public Y yValue;

    public X getxValue(){
        return  xValue;
    }

    public void setxValue(X xValue){
        this.xValue = xValue;
    }

    public <E> void genericMethod(E e){
        System.out.println(e);
    }

    public <E> void genericMethod2(E e[]){
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

    public <E> void minus(E a,E b){
        if(a instanceof Float || b instanceof  Float){
            System.out.println((Float)a+(Float)b);
        }else if(a instanceof Integer && b instanceof  Integer) {
            System.out.println((Integer) a+(Integer)b);
        }
    }

}
