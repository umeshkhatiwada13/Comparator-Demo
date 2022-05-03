package com.comparator.demo;

import java.util.Comparator;

public class CricketerAgeComparator implements Comparator<Cricketer> {
    @Override
    public int compare(Cricketer c1, Cricketer c2) {
        if (c1.getAge() > c2.getAge()) return 1;
        else if (c1.getAge() == c2.getAge()) return 0;
        else return -1;
    }
}
