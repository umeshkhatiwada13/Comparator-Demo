package com.comparator.demo;

import java.util.Comparator;

public class CricketerSalaryComparator implements Comparator<Cricketer> {

    @Override
    public int compare(Cricketer c1, Cricketer c2) {
        if (c1.getSalary() > c2.getSalary()) return 1;
        else if (c1.getSalary() == c2.getSalary()) return 0;
        else return -1;
    }
}
