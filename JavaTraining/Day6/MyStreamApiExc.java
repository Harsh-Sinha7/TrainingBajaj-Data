package com.bajaj.dayfour;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Diplomat implements dpm {
    int id;
    String country;
    String name;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Diplomat{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Diplomat(int id, String country, String name){
        this.id = id;
        this.country=country;
        this.name=name;
    }
}


public class MyStreamApiExc {
    public static void main(String[] args){

       List<Diplomat> diplomatList = new ArrayList<Diplomat>();
       diplomatList.add(new Diplomat(144,"India","Harsh"));
       diplomatList.add(new Diplomat(108,"USA","Jennifer"));
       diplomatList.add(new Diplomat(136,"Australia","Archie"));
       diplomatList.add(new Diplomat(160,"New Zealand","Jacinda"));
       diplomatList.add(new Diplomat(199,"Pakistan","Imran"));
       diplomatList.add(new Diplomat(204,"China","Jinping"));
       diplomatList.add(new Diplomat(101,"UK","Maeve"));
       diplomatList.add(new Diplomat(149,"Finland","Jennifer"));

        System.out.println(diplomatList);

       //1. Count
        long num = diplomatList.stream().count();
        System.out.println("Number of Diplomats are: "+num);


        //2. Min
        Optional<Diplomat> min = diplomatList.stream().min(Comparator.comparing(Diplomat::getId));
        System.out.println("Details of diplomat with minimum id are: "+min);

        //3. Max
        Optional<Diplomat> max = diplomatList.stream().max(Comparator.comparing(Diplomat::getId));
        System.out.println("Details of diplomat with minimum id are: Name "+max);

        //4. Filter
        //input value type same as output
        List<Diplomat> countryWithA = diplomatList.stream().filter(d-> d.country.startsWith("U")).collect(Collectors.toList());
        System.out.println("Details of Country Names starting with A are: "+countryWithA);

        //5. Map

        //return type is string because even though we give object as input, after converting to upper we get string ouput
        List<String> upperDeets= diplomatList.stream().map(s->s.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println("Names of Diplomats in Upper Case: "+upperDeets);

        //6. Distinct
        //Filter + Map together with distinct
        List<String> idfilterLower = diplomatList.stream().filter(s->s.id<150).map(s->s.getName().toLowerCase()).distinct().collect(Collectors.toList());
        System.out.println("Names of Diplomats having id less than 150 in Lower Case: "+idfilterLower);

        //7. For each
        System.out.println("Ids in five digit number forms are:");
        diplomatList.stream().map(d->d.getId()*100).forEach(s-> System.out.println(+s));

        //8. Reduce
        int id_sum = diplomatList.stream().map(x->x.getId()).reduce(0,(sum,i)->sum+i);
        System.out.println("Sum of all ids is : "+id_sum);


        //9. Sort

        List<String> sortedNames = diplomatList.stream().map(s->s.getName()).sorted().collect(Collectors.toList());
        System.out.println("Names in ascending order: "+sortedNames);

        List<Integer> sortedbyId = diplomatList.stream().map(s->s.getId()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Ids of Diplomats in descending order: "+sortedbyId);
    }
}
