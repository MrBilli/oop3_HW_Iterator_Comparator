package oop3.hw;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamComparator extends Stream<Group> implements Comparator, Comparable {


    public StreamComparator() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((Stream<Group>)(o1)).getSize().compareTo(((Stream<Group>)(o2)).getSize());
    }

    @Override
    public int compareTo(Object o) {
        return this.getSize();
    }
}
