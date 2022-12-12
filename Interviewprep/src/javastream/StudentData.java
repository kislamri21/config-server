package javastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentData {

    public static List<Student> getAll(){
        return Stream.of(
                new Student(1, "Jhon", "Paul", "4044569875", "jhon@gmail.com",
                        Arrays.asList("JAVA", "C++", "MySql")),
                new Student(2, "Aqsa", "Jabed", "4044569875", "jhon@gmail.com",
                        Arrays.asList("Python", "C++", "AWS")),
                new Student(3, "Mily", "Rose", "4044569875", "jhon@gmail.com",
                        Arrays.asList("Spring Boot", "NoSql", "AWS")),
                new Student(4, "Eily", "Masu", "4044569875", "jhon@gmail.com",
                        Arrays.asList("C#", "Microservices", "MySql"))

        ).collect(Collectors.toList());

    }
}
