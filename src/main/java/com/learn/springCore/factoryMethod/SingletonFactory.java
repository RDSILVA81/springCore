package com.learn.springCore.factoryMethod;

public class SingletonFactory {

    private static SingletonFactory singletonFactory;
    private SingletonFactory() {
    }

    public static SingletonFactory getInstance(){
        if(singletonFactory==null){
            singletonFactory = new SingletonFactory();
            System.out.println("Creating a new instance");
        }
        System.out.println("Existed instance");
        return singletonFactory;
    }
}
