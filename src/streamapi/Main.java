package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> marks = List.of(89, 85, 98, 97, 92, 81); //unmodifiable list

        System.out.println(marks);

        List<Integer> numbers = new ArrayList<>(); //modifiable list
        numbers.add(1);
        numbers.add(233);
        numbers.add(23);
        numbers.add(778);

        System.out.println(numbers);

        List<Integer> list = Arrays.asList(1178, 920, 910, 745, 1198, 9349); //unmodifiable list

        //without stream
        List<Integer> evenMarks = new ArrayList<>();
        for (Integer i : marks) {
            if (i % 2 == 0) {
                evenMarks.add(i);
            }
        }
        System.out.println(evenMarks);

        //using stream
//        Stream<Integer> stream = marks.stream();
//        List<Integer> streamEvenMarks = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//
//        System.out.println(streamEvenMarks);

        List<Integer> streamEvenMarks1 = marks.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(streamEvenMarks1);

        List<Integer> filteredMarksList = marks.stream().filter(i -> i > 90).collect(Collectors.toList());
        System.out.println(filteredMarksList);

    }

}
