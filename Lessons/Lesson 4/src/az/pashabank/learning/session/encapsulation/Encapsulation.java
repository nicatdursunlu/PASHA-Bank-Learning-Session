package az.pashabank.learning.session.encapsulation;

class Student {

    private int id;
    private String name;
    protected String profession  = "Computer Science";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Student student = new Student();
        student.setId(1);
        student.setName("Durna");
        System.out.printf("New Student's id is %d and name is %s", student.getId(), student.getName());
    }
}
