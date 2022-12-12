package javastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustDatabase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101, "john", "jhon@gmail.com", Arrays.asList("4049782545", "6784587896")) ,
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("4045789632", "3234567854")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("5466321245", "2034578965")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("6784521245", "5032364561"))

        ).collect(Collectors.toList());
    }
}
