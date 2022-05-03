package com.comparator.demo;

import java.util.ArrayList;
import java.util.Collections;

public class CricketerComparatorTest {
    public static void printCricketers(ArrayList<Cricketer> cricketers, String sortBy) {
        if (!sortBy.isEmpty()) System.out.println("Cricketers sorted by " + sortBy + " : ");
        for (Cricketer c : cricketers) {
            System.out.println("Name : " + c.getName() + " Age : " + c.getAge() + " and Salary " + c.getSalary());
        }
        System.out.println();
    }

    public static void main(String... args) {
        ArrayList<Cricketer> cricketers = new ArrayList<>();
        cricketers.add(new Cricketer(1, "Dwayne Bravo", "Trinidadian", "CSK", 34, 35f));
        cricketers.add(new Cricketer(2, "Chris Gayle", "Jamaican", "RCB", 37, 50f));
        cricketers.add(new Cricketer(3, "MS Dhoni", "India", "RCB", 36, 25f));
        cricketers.add(new Cricketer(4, "Kane Williamson", "New Zealand", "SRH", 31, 30f));


        System.out.println("Before Sorting ");
        printCricketers(cricketers, "");

        CricketerAgeComparator cricketerAgeComparator = new CricketerAgeComparator();
        Collections.sort(cricketers, cricketerAgeComparator);
        printCricketers(cricketers, "Age");

        //Comparison based on Salary
        CricketerSalaryComparator cricketerSalaryComparator = new CricketerSalaryComparator();
        Collections.sort(cricketers, cricketerSalaryComparator);
        printCricketers(cricketers, "Salary");

        //Comparison based on Name
        CricketerNameSorting cricketerNameSorting = new CricketerNameSorting();
        Collections.sort(cricketers, cricketerNameSorting);
        printCricketers(cricketers, "Name");

    }
}
