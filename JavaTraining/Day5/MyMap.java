package com.bajaj.javatwo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args){
        Map<String, Students> map = new LinkedHashMap<String,Students>();
        map.put("a", new Students(1029, "Harsh"));
        map.put("a", new Students(1029, "Harsh"));

    }
}
