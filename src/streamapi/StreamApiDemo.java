package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {
        List<String> names = List.of("Ankit", "Anshul", "Aarush", "Vipul");

        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);
    }
}
