package streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {
        List<String> names = List.of("Ankit", "Anshul", "Aarush", "Vipul");

        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        List<Integer> numbers = List.of(100, 60, 90, 14, 17, 12, 20);

        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());

        System.out.println(newNumbers);


        names.stream().forEach(
                e -> {
                    System.out.println(e);
                }
        );


        newNames.stream().forEach(System.out::println);

        //sorted

        numbers.stream().sorted().forEach(System.out::println);


    }
}
