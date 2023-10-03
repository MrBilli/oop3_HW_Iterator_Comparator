package oop3.hw;

import java.util.ArrayList;
import java.util.Collections;

public class StreamService extends StreamComparator {

    public StreamService() {
    }
    public void sortStreams(ArrayList<Stream<Group>> streams, StreamComparator comparator){
        Collections.sort(streams, comparator);
    }
}
