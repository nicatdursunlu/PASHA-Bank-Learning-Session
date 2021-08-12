package az.pashabank.learning.session.stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "User { " +
                "name = " + name + '\'' +
                ", age = " + age +
                " }";
    }
}

public class SortedExample2 {

    public static void main(String[] args) {

        List<User> userList = List.of(
                new User("John", 33),
                new User("Robert", 26),
                new User("Mark", 26),
                new User("Brandon", 42)
        );

        List<User> sortedList = userList.stream()
                .sorted(Comparator.comparingInt(User::getAge).thenComparing(User::getName))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);

//        User { name = Mark', age = 26 }
//        User { name = Robert', age = 26 }
//        User { name = John', age = 33 }
//        User { name = Brandon', age = 42 }
    }
}
