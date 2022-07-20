package _21_streams._collect_Collectors_groupingBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class groupingBy {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Adam", FavouriteColor.BLUE, Arrays.asList(3, 4, 5, 1, 3, 2)));
        studentList.add(new Student("Michael", FavouriteColor.BLACK, Arrays.asList(3, 1, 5, 1, 1, 2)));
        studentList.add(new Student("John", FavouriteColor.BLUE, Arrays.asList(2, 4, 5, 5, 3, 2)));
        studentList.add(new Student("Eva", FavouriteColor.YELLOW, Arrays.asList(5, 4, 5, 5, 3, 3)));
        studentList.add(new Student("Erica", FavouriteColor.BLUE, Arrays.asList(3, 4, 5, 1, 3, 2)));
        studentList.add(new Student("Nicole", FavouriteColor.BLACK, Arrays.asList(4, 4, 5, 4, 3, 3)));

        System.out.println(studentList);

        // initiate a map, open a stream on studentList
        Map<Object, Double> list = studentList.stream()
                // collect Students by favourite colors
                .collect(Collectors.groupingBy(s -> s.favouriteColor,
                        // calc avg for each group
                        Collectors.averagingDouble(i -> i.grades.stream()
                                // before calc average for each group of students,
                                // calc average for each Student
                                .collect(Collectors.averagingInt(Integer::intValue)))));

        System.out.println(list); // print {BLUE=3.1666666666666665, YELLOW=4.166666666666667, BLACK=3.0}
    }
}
