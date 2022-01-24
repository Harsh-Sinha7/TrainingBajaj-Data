package com.bajaj.helloworld;
class Person {
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
public class object {

    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("Harsh");
        myObj.setAge(22);
        System.out.println(myObj.getName());
        System.out.println(myObj.getAge());
    }
}

