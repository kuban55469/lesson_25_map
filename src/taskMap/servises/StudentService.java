package taskMap.servises;

import taskMap.classes.Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface StudentService {
    String createStudent(List<Student> students);
    List<Student> getAll();
    Map<Integer, Student>  getAge (List<Student> students);
    String payKarys (String name, List<Student> students, String karysName, List<Student> students1, BigDecimal kanchaSom);
    List<Student> findByName(String name, List<Student> students);
}
