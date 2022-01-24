package com.bajaj.javatwo;
import java.util.*;

//list maintains insertion order on the other hand set doesn't maintain the insertion order
//set can store duplicate values

public class MySet {
    public static void main(String[] args){
        //LinkedHash Set, Hash Set, Tree Set
        //Set<Students> studentsSet = new TreeSet<Students>(new SortByName());
        //sort by implementing comparator in Student, or by giving new sorting method in array
        Set<Students> studentsSet = new HashSet<Students>();

        studentsSet.add(new Students(1029,"Harsh"));
        studentsSet.add(new Students(1022,"Satvik"));
        studentsSet.add(new Students(1057,"Riya"));
        studentsSet.add(new Students(1089,"Aditya"));
        studentsSet.add(new Students(1046,"Sumer"));

        for(Students s :studentsSet){
            System.out.println(s);
        }

    }

}
