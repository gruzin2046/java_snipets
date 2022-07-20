package _21_streams._collect_Collectors_groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {
    final String name;
    final FavouriteColor favouriteColor;
    final List<Integer> grades;

    public Student(String name, FavouriteColor favouriteColor, List<Integer> ints) {
        this.name = name;
        this.favouriteColor = favouriteColor;
        this.grades = ints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && favouriteColor == student.favouriteColor && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, favouriteColor, grades);
    }
}
