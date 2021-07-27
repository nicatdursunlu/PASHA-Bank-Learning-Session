package az.pashabank.learning.session.thiskeyword;

class Student {
    Faculty faculty;
    String name;

    public Student() {}

    public Student(Faculty faculty, String name) {
        this(faculty);
        this.name = name;
    }

    public Student(Faculty faculty) {
        this.faculty = faculty;
    }

    public void displayFaculty(Faculty faculty) {
        this.welcomeStudent();
        System.out.println("The Faculty is " + faculty.name);
    }

    public void welcomeStudent() {
        System.out.println("Welcome to the board ");
    }

    public Student getStudent(){
        return this;
    }
}

class Faculty {
    String name;

    public Faculty(String name) {
        this.name = name;
        Student student = new Student(this, "studentName");
        student.displayFaculty(this);
    }

    public static void main(String[] args) {
        Faculty faculty = new Faculty("Engineering");
        Student student = new Student().getStudent();
    }
}
