package az.pashabank.learning.session.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {

        Student student = new Student();
        student.setBirthYear(1990);
        student.setEyeColor("blue");

        student.calculateAge();
        student.sayGreeting();
        student.printEyeColor();
    }
}
