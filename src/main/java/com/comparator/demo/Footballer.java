package com.comparator.demo;

import lombok.*;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Footballer implements Comparable<Footballer> {

    private int id;

    private String name;

    private String country;

    private String club;

    private int age;

    private float salary;

    public Footballer(int id, String name, String country, String club, int age, float salary) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.club = club;
        this.age = age;
        this.salary = salary;
    }

    List<String> nameOrder = Arrays.asList("Eden Hazard", "C. Ronaldo", "Karim Benzema");

    @Override
    public int compareTo(Footballer ftbler) {
//        if (this.salary > ftbler.salary) return 1;
//        else if (this.salary < ftbler.salary) return -1;
//        else return 0;

        //Custom Sorting using comperable
        if (nameOrder.indexOf(this.name) > nameOrder.indexOf(ftbler.name)) return 1;
        else if (nameOrder.indexOf(this.name) < nameOrder.indexOf(ftbler.name)) return -1;
        else return 0;
    }

}
