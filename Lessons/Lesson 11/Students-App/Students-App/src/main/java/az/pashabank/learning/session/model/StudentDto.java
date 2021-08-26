package az.pashabank.learning.session.model;

public class StudentDto {

    private Long id;

    private String name;

    public StudentDto(String name) {
        this.name = name;
    }

    public StudentDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
