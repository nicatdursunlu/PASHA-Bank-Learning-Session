package az.pashabank.learning.session.polymorphism;

import java.time.LocalDate;

public class Student implements People {

    private int birthYear;
    private String eyeColor;

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public void sayGreeting() {
        System.out.println("Hello World!");
    }

    @Override
    public void calculateAge() {
        System.out.println("Age " + (LocalDate.now().getYear() - birthYear));
    }

    @Override
    public void printEyeColor() {
        System.out.println("Eye color: " + eyeColor);
    }
}
