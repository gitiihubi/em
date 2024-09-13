package ir.freeland.lambda.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class AddToList {

    private final Student iman;
    private final Student hasan;
    private final Student moji;
    private final Student ali;
    private final List<Student> students = new ArrayList<>();

    // Constructor Injection using @Autowired (optional in Spring Boot, but preferred)
    @Autowired
    public AddToList(Student iman, Student hasan, Student moji, Student ali) {
        this.iman = iman;
        this.hasan = hasan;
        this.moji = moji;
        this.ali = ali;
    }

    public void printStudent(List<Student> s) {
        s.forEach(System.out::println);
    }

    public void addStudent() {
        // students.add(iman);
        // students.add(hasan);
        // students.add(moji);
        // students.add(ali);
        Collections.addAll(students, iman, hasan, moji, ali);
    }

    public List<Student> sortStudents() {
        addStudent();
        return students.stream().sorted().collect(Collectors.toList());
    }

    public List<Student> reverseSortStudents() {
        addStudent();
        return students.stream().distinct().sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public void groupStudentsByGradeUpper10() {
        addStudent();
        Map<Boolean, List<Student>> studentsGroup = students.stream().distinct()
                .collect(Collectors.groupingBy(student -> student.getGrade() > 10));
        System.out.println("above 10");
        printStudent(studentsGroup.get(true));
        System.out.println("under 10");
        printStudent(studentsGroup.get(false));
    }

    public void groupStudentsByAge() {
        addStudent();
        Map<Boolean, List<Student>> studentsGroup = students.stream().distinct()
                .collect(Collectors.groupingBy(student -> student.getAge() >= 13));
        System.out.println("above 13");
        printStudent(studentsGroup.get(true));
        System.out.println("under 13");
        printStudent(studentsGroup.get(false));
    }

    public void averageGrade() {
        addStudent();
        System.out.println(students.stream().distinct()
                .collect(Collectors.averagingDouble(Student::getGrade)));
    }

    public void averageGradeAbove18yearsOld() {
        addStudent();
        System.out.println(students.stream().distinct().filter(s -> s.getAge() >= 18)
                .collect(Collectors.averagingDouble(Student::getGrade)));
    }
}
