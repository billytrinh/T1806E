package Assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {

    public ArrayList<PhoneNumber> PhoneList;

    public PhoneBook(){
        this.PhoneList = new ArrayList<PhoneNumber>();
    }

    @Override
    public void insertPhone(String name, String phone) {
      //  int count = 0;
        for(int i=0;i<this.PhoneList.size();i++){
            if(this.PhoneList.get(i).name.equals(name)){
//                if(!this.PhoneList.get(i).phone.equals(phone)){
//                    this.PhoneList.get(i).phone += ":"+phone;
//                }
                String[] arrPhones = this.PhoneList.get(i).phone.split(":");
                for (int j = 0; j < arrPhones.length; j++) {
                    if(arrPhones[i].equals(phone)){
                        return;
                    }
                }
                this.PhoneList.get(i).phone += ":"+phone;
                return;
            }
        }
       // if (count == 0){
            this.PhoneList.add(new PhoneNumber(name,phone));
       // }
    }

    @Override
    public void removePhone(String name) {
        for(int i=0;i<this.PhoneList.size();i++){
            if(this.PhoneList.get(i).name.equals(name)){
                this.PhoneList.remove(i);
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for(int i=0;i<this.PhoneList.size();i++){
            if(this.PhoneList.get(i).name.equals(name)){
                this.PhoneList.get(i).phone = newphone;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for(int i=0;i<this.PhoneList.size();i++){
            if(this.PhoneList.get(i).name.equals(name)){
                System.out.println(this.PhoneList.get(i).name+" SDT: "+this.PhoneList.get(i).phone);
                break;
            }
        }
    }

    @Override
    public void sort() {
//        Collections.sort(this.PhoneList);
//        for (PhoneNumber phoneNumber:this.PhoneList){
//            System.out.println(phoneNumber.name+" SDT: "+phoneNumber.phone);
//        }
        ArrayList<PhoneNumber> phoneNumbers = new ArrayList<>();
        this.PhoneList.stream().sorted(new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        }).forEach(phoneNumber -> {phoneNumbers.add(phoneNumber);});
        this.PhoneList = phoneNumbers;
        this.displayPhoneNumber();
    }

    public void displayPhoneNumber(){
        for (PhoneNumber phoneNumber:this.PhoneList){
            System.out.println(phoneNumber.name+" SDT: "+phoneNumber.phone);
        }
    }
}
