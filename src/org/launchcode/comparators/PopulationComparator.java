package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        //Type cast City's population filed to Integer object so I can use compareTo()
        Integer first = new Integer(o1.getPopulation());
        Integer second = new Integer(o2.getPopulation());

        return first.compareTo(second);
    }
}
