package az.pashabank.learning.session.object;

class Student {
    int id;
    String name;

    public Student() {}

    public Student(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }

    public void initializeStudent(int studentId, String studentName) {
        id = studentId;
        name = studentName;
    }

    public String displayStudent() {
        return id + " " + name;
    }
}

public class LearningSessionApplication {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Leman";
        System.out.println("Object initialized through reference is " + student1.displayStudent());

        Student student2 = new Student();
        student2.initializeStudent(2, "Anar");
        System.out.println("Object initialized through method is " + student2.displayStudent());

        Student student3 = new Student(3, "Farid");
        System.out.println("Object initialized constructor method is " + student3.displayStudent());
    }
}
