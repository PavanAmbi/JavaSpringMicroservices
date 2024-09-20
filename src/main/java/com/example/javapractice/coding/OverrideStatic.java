package com.example.javapractice.coding;

public class OverrideStatic implements OverrideDemo1, OverrideDemo2, Cloneable{

    public static void main(String[] args) {

    }

    @Override
    public void print2() {
        OverrideDemo1.super.print2();
    }

    @Override
    public OverrideStatic clone() throws CloneNotSupportedException {
        OverrideStatic overrideStatic = (OverrideStatic) super.clone();
        return new OverrideStatic();
    }
}
interface OverrideDemo1 {
    static void print1() {
        System.out.println("Child print1");
    }
    default void print2(){
        System.out.println("Child print2");
    }

}
interface OverrideDemo2 {
    static void print1() {
        System.out.println("Child print1");
    }
    default void print2(){
        System.out.println("Child print2");
    }

}
