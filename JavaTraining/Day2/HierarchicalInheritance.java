package com.bajaj.helloworld;


class D{
    D(){}
    void printD() {
        System.out.println("D's print function");
    }
}

class E extends D{
    E(){}

    void printD() {
        System.out.println("printD function of E");
    }
    void printE() {
        System.out.println("printE function of E");
    }
}

class F extends E{
    F(){}
    void printF() {
        System.out.println("F's print function");
    }
}

public class HierarchicalInheritance {
    public static void main(String args[]) {
        F f = new F();
//		f.printD();
//		D e = new E();
        f.printD();
    }
}
