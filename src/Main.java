import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("Java", "Spring");

        List<String> uCourses = courses.stream().map(course -> course.toUpperCase()).toList();



        System.out.println(uCourses);
    }
}