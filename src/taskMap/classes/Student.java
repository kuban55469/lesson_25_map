package taskMap.classes;

import taskMap.enums.Gender;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Student {
    private long id;
    private String name;
    private LocalDate dateOhBrith;
    private Gender gender;
    private BigDecimal money;

    public Student(long id, String name, LocalDate dateOhBrith, Gender gender, BigDecimal money) {
        this.id = id;
        this.name = name;
        this.dateOhBrith = dateOhBrith;
        this.gender = gender;
        this.money = money;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOhBrith() {
        return dateOhBrith;
    }

    public void setDateOhBrith(LocalDate dateOhBrith) {
        this.dateOhBrith = dateOhBrith;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return
                "\nid: " + id +
                "\nname: " + name +
                "\ndateOhBrith: " + dateOhBrith +
                "\ngender: " + gender +
                "\nmoney: " + money +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
    }
}
