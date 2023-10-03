package oop3.hw;

import java.util.ArrayList;
import java.util.Iterator;

public class Stream<Group> implements Iterable, Iterator {

    protected int number;
    protected int currentIndex;
//    protected int size;
    protected ArrayList<Group> stream= new ArrayList<>();

    public Stream(ArrayList<Group> stream, int number) {
        this.number = number;
        this.stream = stream;
        this.currentIndex = 0;
    }

    public Stream() {
    }


    public Integer getSize(){
        return this.stream.size();
    }

    @Override
    public String toString() {
        return "Stream " + number
                + ":\n"
                + stream;
    }

    @Override
    public Iterator iterator() {
        return (Iterator) this;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < stream.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            if (this.currentIndex == this.getSize() -1)
                return this.currentIndex = 0;
            return this.currentIndex++;
        }
        throw new IllegalArgumentException();
    }
}
