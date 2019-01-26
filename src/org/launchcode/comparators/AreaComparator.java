package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        //Type cast City's area field to Double object so I can use compareTo()
        Double first = new Double(o1.getArea());
        Double second = new Double(o2.getArea());

        return first.compareTo(second);
    }
}
