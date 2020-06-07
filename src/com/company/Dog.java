package com.company;

public class Dog extends Animal implements LiveAble,Pet{
    @Override
    public void shouYang(){

    }
    @Override
    public void show(){
        System.out.println("show重写");
    }
    @Override
    public void method(){
        System.out.println("dog");
    }


}
