package com.amazon.ata.deliveringonourpromise.comparators;

import com.amazon.ata.deliveringonourpromise.types.Promise;

import java.util.Comparator;


public class PromiseAsinComparator implements Comparator<Promise> {

    @Override
    public int compare(Promise o1, Promise o2) {
        int compare = o1.getAsin().compareTo(o2.getAsin());
        if (o1.getAsin().equals(o2.getAsin())) {
            return 0;
        }
        return compare;
    }

}





/*
    gives us 2 promises
    take the two and extract the 2 Asin codes
    compare the two Asin codes alphabetically from ascending order
    compare the two Asin codes numerically from ascending order
    return a positive number if the first Asin code is less than the second Asin code
    return a negative number if the first Asin code is greater than the second Asin code

    notes:
    use an interface on the methods
    revisit the interface guided project and re-learn it
 */
