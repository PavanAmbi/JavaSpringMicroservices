package com.example.javapractice.coding;

import java.util.HashMap;

public class StringQustions {
    public static void main(String[] args) {

        HashMap<NewKey, Integer> map = new HashMap<>();
        map.put(new NewKey(), 1);
        map.put(new NewKey(), 2);
        map.put(new NewKey(), 3);
        map.put(new NewKey(), 4);

        System.out.println(map);
    }
}

class NewKey {

    public int hashCode(){
        return 43;
    }

    @Override
    public String toString() {
            return "NewKey";
    }
}
