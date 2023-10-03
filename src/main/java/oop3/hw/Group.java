package oop3.hw;

public class Group {
    private int number;
    private int size;

    @Override
    public String toString() {
        return "Group number " + number +
                ", has " + size +
                " students\n";
    }

    public Group(int number, int size) {
        this.number = number;
        this.size = size;
    }
}
