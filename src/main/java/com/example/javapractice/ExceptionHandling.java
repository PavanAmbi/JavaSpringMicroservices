package com.example.javapractice;

import java.util.HashMap;
import java.util.Map;

public class ExceptionHandling {
    public static void main(String[] args){

        Map<NewKey,Integer> map = new HashMap<NewKey,Integer>();
        map.put(new NewKey(1), 1);
        map.put(new NewKey(1), 2);
        map.put(new NewKey(1), 3);
        map.put(new NewKey(2), 4);

        System.out.println(map.values());
    }
}


class NewKey {

    private int id;
    public NewKey(int id) {
        this.id = id;
    }


    @Override
    public int hashCode(){
        return 43;
    }

    @Override
    public boolean equals(Object obj){
       NewKey newKey = (NewKey)obj;
       return this.id == newKey.id;
       //return this == obj;
    }


}
class MyCustomException extends Exception {

    public MyCustomException(String message) {
        super(message);
    }
}
