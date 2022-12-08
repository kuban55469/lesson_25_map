package taskMap;

import taskMap.classes.Student;
import taskMap.enums.Gender;
import taskMap.servises.impl.StudentServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(11,"Kuban", LocalDate.of(2002,12,17), Gender.MALE, BigDecimal.valueOf(15000));
        Student student2 = new Student(22,"Sezim", LocalDate.of(2005,3,10), Gender.MALE, BigDecimal.valueOf(20000));
        Student student3 = new Student(33,"Janysh", LocalDate.of(1993,4,9), Gender.MALE, BigDecimal.valueOf(25000));
        Student student4 = new Student(44,"Asel", LocalDate.of(1999,9,5), Gender.MALE, BigDecimal.valueOf(30000));

        List<Student> students = new ArrayList<>(List.of(student1,student2,student3,student4));
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        StudentServiceImpl student = new StudentServiceImpl();


        while (true){
            System.out.println("""
                    1: создать студентов.
                    2: вывести всех студентов.
                    3: узнать возраст.
                    4: Брать на долг деньги.
                    5: найти по имени.
                    """);
            switch (scanner.nextInt()) {
                case 1 -> System.out.println(student.createStudent(students));
                case 2 -> System.out.println(student.getAll());
                case 3 -> System.out.println(student.getAge(students));
                case 4 -> {
                    System.out.println("Ким карызга алат: ");
                    String name = scanner1.nextLine();
                    System.out.println("Кимден алсын: ");
                    String name1 = scanner1.nextLine();
                    System.out.println("Канча сом: ");
                    int s = scanner1.nextInt();
                    System.out.println(student.payKarys(name, students, name1, students, BigDecimal.valueOf(s)));
                }
                case 5 -> {
                    System.out.println("Enter name: ");
                    String name = scanner1.nextLine();
                    System.out.println(student.findByName(name, students));
                }
                default -> System.out.println("Ввдите цифры от 1 до 5 !!!");
            }
        }
    }
}
