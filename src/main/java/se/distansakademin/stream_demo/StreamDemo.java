package se.distansakademin.stream_demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // Names stream demo
        List<String> names = Arrays.asList("Linus", "Anna", "Bob", "Charlie", "Vanessa", "Adam", "Lucky");

        List<String> filteredNames = names.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("L"))
                .sorted()
                .toList();

        System.out.println(names);
        System.out.println(filteredNames);

        // Numbers stream demo
        var numbersInOrder = Stream.of(5,4,3,5,6,4)
                .sorted()
                .toList();

        System.out.println(numbersInOrder);


        // Skapa en lista av minst 4 personer
        var personsList = Arrays.asList(
                new Person("trettifyra", 1990),
                new Person("tjugofyra", 2000),
                new Person("furtifyra", 1980));

        // Filtrera bort alla under 18
        var filteredPersons = personsList.stream().filter(p -> p.getAge() >= 18);

        // Sortera i bokstavsordning på namn
        var sortedPersons = filteredPersons.sorted(Comparator.comparing(Person::getName));

        // Gör om till en lista
        personsList = sortedPersons.toList();

        // Skriv ut alla personer
        System.out.println(personsList);
    }
}
