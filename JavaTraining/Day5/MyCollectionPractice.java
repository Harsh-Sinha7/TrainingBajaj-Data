package com.bajaj.javatwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


class Students
{
    int rollno;
    String name;
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students [rollno=" + rollno + ", name=" + name + "]";
    }
    public Students(int rollno, String name) {
        super();
        this.rollno = rollno;
        this.name = name;
    }

    public int compareTo(Students e2) {

        if(this.rollno>e2.getRollno())
        {
            return -1;
        }
        else if(this.rollno<e2.getRollno())
        {
            return 1;
        }
        else
        {
            // TODO Auto-generated method stub
            return 0;
        }
    }

}

public class MyCollectionPractice {

    public static void main(String args[])
    {
        List<Students> ls=new ArrayList<Students>();


        ls.add(new Students(1029,"Harsh"));
        ls.add(new Students(1021,"Satvik"));
        ls.add(new Students(1057,"Riya"));
        ls.add(new Students(1008,"Aditya"));
        ls.add(new Students(1076,"Aashna"));
        ls.add(new Students(1046,"Sumer"));
        ls.add(new Students(1050,"Pranav"));
        ls.add(new Students(1028,"Girija"));


        for(Students str:ls)
        {
            //str.toString();
            System.out.println(str.toString());
        }

        System.out.println("Sorted LIST BY id");
        //sort and then print again
        Collections.sort(ls,new SortById());
        for(Students str:ls)
        {
            //str.toString();
            System.out.println(str.toString());
        }
        System.out.println("Sorted LIST BY NAME");
        //sort and then print again
        Collections.sort(ls,new SortByName());
        for(Students str:ls)
        {
            //str.toString();
            System.out.println(str.toString());
        }


    }

}