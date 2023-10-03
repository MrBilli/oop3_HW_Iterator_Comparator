package oop3.hw;

import java.util.ArrayList;
import java.util.List;

public class MainAcademy {
    public static void main(String[] args) {
//— Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
//— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
//— Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
//— Модифицировать класс Контроллер, добавив в него созданный сервис;
//— Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
//
//                Формат сдачи: ссылка на гитхаб проект
        Group a = new Group(1, 14);
        Group b = new Group(2, 19);
        Group c = new Group(3, 17);
        Group d = new Group(4, 16);
        Group e = new Group(5, 18);
        Group f = new Group(6, 25);

        ArrayList<Group> groupList = new ArrayList<>(List.of(a,b,c));
        Stream<Group> stream = new Stream<>(groupList,1);

        ArrayList<Group> groupList1 = new ArrayList<>(List.of(d,e));
        Stream<Group> stream1 = new Stream<>(groupList1,2);

        ArrayList<Group> groupList2 = new ArrayList<>(List.of(f));
        Stream<Group> stream2 = new Stream<>(groupList2,3);

        ArrayList<Stream<Group>> streams = new ArrayList<>(List.of(stream, stream2, stream1));
        System.out.println(streams);

        StreamComparator streamComparator = new StreamComparator();
        System.out.println(streamComparator.compare(stream, stream1));

        StreamService streamService = new StreamService();
        streamService.sortStreams(streams,streamComparator);
        System.out.println(streams);

    }
}
