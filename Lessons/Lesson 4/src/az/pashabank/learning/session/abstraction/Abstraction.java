package az.pashabank.learning.session.abstraction;

import java.time.LocalDate;
import java.time.LocalDateTime;

abstract class People implements Greeting {
    abstract void calculateAge();
}

class Teacher extends People {
    private int birthYear;

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    void calculateAge() {
        System.out.println("Age is " + (LocalDate.now().getYear() - birthYear));
    }

    @Override
    public void sayGreeting() {
        System.out.println("Hiiii");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setBirthYear(1995);
        teacher.calculateAge();
        teacher.sayGreeting();
    }
}
