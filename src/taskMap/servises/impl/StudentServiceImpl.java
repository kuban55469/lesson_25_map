package taskMap.servises.impl;

import taskMap.classes.Student;
import taskMap.servises.StudentService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StudentServiceImpl implements StudentService {

    List<Student> newStudent = new ArrayList<>();

    @Override
    public String createStudent(List<Student> students) {
        newStudent.addAll(students);
        return "Students created saccessfully!!";
    }

    @Override
    public List<Student> getAll() {
        return newStudent;
    }

    @Override
    public Map<Integer, Student> getAge(List<Student> students) {
        Map<Integer,Student> studentMap = new LinkedHashMap<>();
        for (Student student : students) {
            int age = Period.between(student.getDateOhBrith(),LocalDate.now()).getYears();
            studentMap.put(age,student);
        }

        return studentMap;
    }

    @Override
    public String payKarys(String name, List<Student> students, String karysName, List<Student> students1, BigDecimal kanchaSom) {
        for (Student student : students) {
            if (student.getName().equals(name)){
                for (Student student1 : students1) {
                    if (student1.getName().equals(karysName)){
                        int r = student1.getMoney().subtract(kanchaSom).intValue();
                        if (r >= 0){
                            student.setMoney(student.getMoney().add(kanchaSom));
                            student1.setMoney(student1.getMoney().subtract(kanchaSom));
                            return "Эртен созсуз бер!!";
                        } else if (r < 0) {
                            return "Анча акчам жок!!";
                        }
                    }
                }
            }
        }
        return "Anday student jok!!";
    }

    @Override
    public List<Student> findByName(String name, List<Student> students) {
        List<Student> studentList = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equals(name)){
                studentList.add(student);
            }
        }
        return studentList;
    }
}
