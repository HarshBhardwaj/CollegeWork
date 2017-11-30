package com.company;

public class Sibling {
    private String name;
    private int age, weight;

    public Sibling(){
        this.name="";
        this.age=0;
        this.weight=0;
    }

    public Sibling(String name, int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    int getWeight(){
        return weight;
    }

    void display(){
        System.out.println(name+" "+age+" "+weight);
    }
}
