package az.pashabank.learning.session.statickeyword;

class Student {
    int id;
    String name;
    static String profession = "Computer Science";

    public Student() {}

    public Student(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }

    String displayStudent() {
        return id + " " + name + " " + profession;
    }

    static void changeProfession() {
        profession = "Business Administration";

        System.out.println("Change value of profession " + profession);
    }
}

public class LearningSessionApplication {

    static String message;

    static {
        message = "Welcome to the Learning Session";
        System.out.println(message);
    }

    public static void main(String[] args) {

        Student student1 = new Student(1, "Anar");
        Student student2 = new Student(2, "Necef");

        System.out.println(student1.displayStudent() + "\n" + student2.displayStudent());

        Student.changeProfession();
        System.out.println(student1.displayStudent() + "\n" + student2.displayStudent());
    }
}
