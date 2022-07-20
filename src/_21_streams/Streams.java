package _21_streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.*;

public class Streams {
    // we can find length of the longest item in the list using for loop:
    public int lengthOfLongestString(List<String> list) {
        int length = list.get(0).length();
        for(String s: list) {
            if (s.length() > length) length = s.length();
        }
        return length;
    }

    // or simpler way creating a stream
    public Optional<Integer> lengthOfLongestString2(List<String> list) {
        return list.stream()
                .map(String::length)
                .max(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("ala", "ma", "kota", "kot", "ma", "problem"));
        Streams s = new Streams();
        System.out.println(s.lengthOfLongestString(strList));
        System.out.println(s.lengthOfLongestString2(strList));
    }

    // common stream() usage

    // Accumulate names into a List
    // List<String> list = people.stream()
    // .map(Person::getName)
    // .collect(Collectors.toList());

    // Accumulate names into a TreeSet
    // Set<String> set = people.stream()
    // .map(Person::getName)
    // .collect(Collectors.toCollection(TreeSet::new));

    // Convert elements to strings and concatenate them, separated by commas
    // String joined = things.stream()
    // .map(Object::toString)
    // .collect(Collectors.joining(", "));

    // Compute sum of salaries of employee
    // int total = employees.stream()
    // .collect(Collectors.summingInt(Employee::getSalary));

    // Group employees by department
    // Map<Department, List<Employee>> byDept = employees.stream()
    // .collect(Collectors.groupingBy(Employee::getDepartment));

    // Compute sum of salaries by department
    // Map<Department, Integer> totalByDept = employees.stream()
    // .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingInt(Employee::getSalary)));

    // Partition students into passing and failing
    // Map<Boolean, List<Student>> passingFailing = students.stream()
    // .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
}