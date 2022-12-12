package javastream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentMapping {

    public static void main(String[] args) {

        //Get List of students
        List<Student> students = StudentData.getAll();
        System.out.println(students);

        // Mapping students by phoneNumber one to one transformation

        List<String> studPhone = students.stream()
                .map(student -> student.getPhoneNumber())
                .collect(Collectors.toList());
        System.out.println("Student phone number: " + studPhone);

        // Mapping student firstName and phone number
        List<String> stuName = students.stream()
                .map(student -> student.getFirstName())
                .collect(Collectors.toList());
        System.out.println("Student name: " + stuName);


        // Mapping student courses
        List<List<String>> stucourses = students.stream()
                .map(student -> student.getCourses())
                .collect(Collectors.toList());
        System.out.println("Student Courses: " + stucourses);

        //FlatMapping one to Manny relation
        List<String> stucourses1 = students.stream()
                .flatMap(student -> student.getCourses().stream())
                .collect(Collectors.toList());
        System.out.println(stucourses1);

        // Mapping student firstName and courses

        students.stream()
                        .collect(Collectors.toMap(student -> student.getFirstName(), student -> student.getCourses()))
                                .entrySet()
                                        .stream()
                .forEach(System.out::println);


        //Mapping student firstName  and email
        students.stream()
                .collect(Collectors.toMap(student -> student.getFirstName(), student -> student.getEmailId()))
                .entrySet()
                .stream()
                .forEach(System.out::println);

        // Using collectors.toMap(), Map from streams having unique key
        students.stream()
                .collect(Collectors.toMap(student -> student.getStudId(), student -> student.getLastName() ))
                .entrySet()
                .stream()
                .forEach(System.out::println);

        //Group the stream by Key

        Map<String, List<Student>>groupByName = students.stream()
                    .collect(Collectors.groupingBy(student -> student.getFirstName()));
        System.out.println(groupByName);

        //Group the stream by key and value
      Map<String, Long>  countByName = students.stream()
                .collect(Collectors.groupingBy(Student::getFirstName, Collectors.counting()));
      System.out.println(countByName
      );

      // Some student have same name where key is student name and value is sum of courses
     Map<String, Integer> courseByName  = students.stream()
                .collect(Collectors.groupingBy(Student::getFirstName, Collectors.summingInt(Student::getStudId)));
     System.out.println(courseByName);



    }




}
