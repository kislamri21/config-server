package javastream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStream {

    public static void main(String[] args){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "sive", 101, "active", 2000));
        empList.add(new Employee(102, "reddy", 101, "active", 5000));
        empList.add((new Employee(101, "raju", 102, "inactive", 6000)));
        empList.add(new Employee(104, "shivan", 102, "inactive", 4000));
        empList.add(new Employee(105, "bob", 103, "active", 3500));
        empList.add(new Employee(106, "alice", 103, "inactive", 3500));
        empList.add((new Employee(107, "srinu", 104, "active", 3500)));

        // to print employee details based on department Id
        Map<Integer, List<Employee>> empListBaseOnDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));

        empListBaseOnDept.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + "----------" + entry.getValue());
        });

    }
}
