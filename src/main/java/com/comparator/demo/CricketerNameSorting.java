package com.comparator.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CricketerNameSorting implements Comparator<Cricketer> {
    List<String> nameOrder = Arrays.asList("Dwayne Bravo", "MS Dhoni", "Kane Williamson", "Chris Gayle");

    @Override
    public int compare(Cricketer c1, Cricketer c2) {
        return Integer.valueOf(nameOrder.indexOf(c1.getName()))
                .compareTo(Integer.valueOf(nameOrder.indexOf(c2.getName())));
    }
}
