package com.comparator.demo;

import java.util.ArrayList;
import java.util.Collections;

public class FootballerComperableTest {
    public static void printFootballers(ArrayList<Footballer> footballers) {
        for (Footballer f : footballers) {
            System.out.println("Name : " + f.getName() + " and Salary " + f.getSalary());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Footballer> footballers = new ArrayList<>();
        footballers.add(new Footballer(1, "Karim Benzema", "France", "Real Madrid", 34, 35f));
        footballers.add(new Footballer(2, "C. Ronaldo", "Portugal", "Man Utd.", 37, 50f));
        footballers.add(new Footballer(3, "S. Ramos", "Spain", "PSG", 36, 25f));
        footballers.add(new Footballer(4, "Eden Hazard", "Belgium", "Real Madrid", 31, 30f));
        footballers.add(new Footballer(5, "Leo Messi", "Argentina", "PSG", 35, 40f));


        System.out.println("Before Sorting : ");
        printFootballers(footballers);
        Collections.sort(footballers);
        System.out.println("After Sorting : ");
        printFootballers(footballers);
    }
}
